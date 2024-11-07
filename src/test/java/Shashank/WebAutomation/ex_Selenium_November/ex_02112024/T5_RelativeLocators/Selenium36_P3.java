package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T5_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium36_P3 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_relativeLocators() throws InterruptedException {

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        Thread.sleep(2000);

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.id("username"));
        WebElement usernameError = driver.findElement(with(By.tagName("small")).below(username));

        String errorText = usernameError.getText();
        System.out.println(errorText);

        Assert.assertTrue(usernameError.isDisplayed());
        Assert.assertEquals(errorText, "Username must be at least 3 characters");

        
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}