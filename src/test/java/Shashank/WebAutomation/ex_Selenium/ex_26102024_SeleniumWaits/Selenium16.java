package Shashank.WebAutomation.ex_Selenium.ex_26102024_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium16 {

    @Test
    public void test_MakeMyTrip() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.makemytrip.com/");

//        Condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-cy=\"closeModal\"]")));

        WebElement closePopUp = driver.findElement(By.cssSelector("span[data-cy=\"closeModal\"]"));
        closePopUp.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
