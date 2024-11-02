package Shashank.WebAutomation.ex_Selenium.ex_27102024.topic2_JsExecutor;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium22_JsDemo {
    WebDriver driver;
    Alert alert;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify JS Demo")
    @Test
    public void test_jsDemo() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        jsExecutor.executeScript("alert('Hello Shashank')");
        Thread.sleep(1000);
        alert = driver.switchTo().alert();
        alert.accept();


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
