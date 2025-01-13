package Shashank.WebAutomation.Interview_Preparation.ex_13012025.TakingScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class TakeScreenshot_1 {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.get("https://omni.axisbank.co.in/axisretailbanking/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void takeFullPageScreenshot_TakesScreenshot(WebDriver driver){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_13012025/TakingScreenshot/screenshots/AxisBank_TakesScreenshot.jpg");
        source.renameTo(destination);
    }

    @Test
    public void test_takeScreenshot(){

        WebElement logo = driver.findElement(By.id("logo"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(logo));

        takeFullPageScreenshot_TakesScreenshot(driver);
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
