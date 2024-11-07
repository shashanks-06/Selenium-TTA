package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T5_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium34_P1 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_relativeLocators() {

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near

        driver.get("https://awesomeqa.com/practice.html");

        WebElement expSpanElement = driver.findElement(By.xpath(
                "//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(expSpanElement)).click();

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}