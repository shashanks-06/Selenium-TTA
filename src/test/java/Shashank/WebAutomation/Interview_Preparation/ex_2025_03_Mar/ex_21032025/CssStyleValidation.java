package Shashank.WebAutomation.Interview_Preparation.ex_2025_03_Mar.ex_21032025;

// 8) How would you automate a scenario where you need to verify a specific color, font, and position of
// an element on a webpage?

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class CssStyleValidation {

    static WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("guest");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
    }

    public static Color convertRgbaToColor(String rgba){
        String[] values = rgba.replace("rgba(","").replace(")", "").split(", ");
        int r = Integer.parseInt(values[0]);
        int g = Integer.parseInt(values[1]);
        int b = Integer.parseInt(values[2]);
        int a = Integer.parseInt(values[3]);
        return new Color(r, g, b, a);
    }

    public static WebElement getSubmitBtn(){
        return driver.findElement(By.xpath("//button[@class=\" _acan _acap _acas _aj1- _ap30\"]"));
    }


    @Test(priority = 1)
    public void test_validateColor(){

        String colorValue = getSubmitBtn().getCssValue("background-color");
        System.out.println("Color (RGB) : " + colorValue);

        Color actualColor = convertRgbaToColor(colorValue);
        Color expectedColor = new Color(0, 149, 246, 1);
        Assert.assertEquals(expectedColor, actualColor, "Color Validation Failed");
    }

    @Test(priority = 2)
    public void test_validateFont(){
        WebElement button = getSubmitBtn();

        String fontFamily = button.getCssValue("fontFamily");
        String fontSize = button.getCssValue("fontSize");

        System.out.println("Font-Family : " + fontFamily + " | Font-Size : " + fontSize);

        Assert.assertTrue(fontFamily.contains("apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, Helvetica, Arial, sans-serif"),
                "Font-Family Validation Failed!");
        Assert.assertTrue(fontSize.contains("14px"), "Font-Size Validation Failed!");
    }




    @AfterTest
    public void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
