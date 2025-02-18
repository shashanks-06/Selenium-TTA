package Shashank.WebAutomation.Interview_Preparation.ex_2025_01_Jan.ex_14012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicXPath {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new EdgeDriver(options);

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test_checkAvailabilityBtn(){
        WebElement checkBtn = driver.findElement(By.xpath(
                "//input[contains(@value, 'Check availability')]")); // Dynamic XPath using contains() method

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(checkBtn));

        checkBtn.click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }

}
