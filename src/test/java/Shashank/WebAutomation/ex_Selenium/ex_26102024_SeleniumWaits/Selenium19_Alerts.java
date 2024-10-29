package Shashank.WebAutomation.ex_Selenium.ex_26102024_SeleniumWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium19_Alerts {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // //button[text()='Click for JS Alert']
        // //button[@onclick='jsAlert()']
//        WebElement elementAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        elementAlert.click();

//        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//        elementConfirm.click();

        WebElement elementPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();

        alert.sendKeys("Shashank");
        alert.accept();


        String result = driver.findElement(By.cssSelector("#result")).getText();

//        Assert.assertEquals(result, "You successfully clicked an alert");

//        Assert.assertEquals(result, "You clicked: Ok");
//        Assert.assertEquals(result, "You clicked: Cancel");

        Assert.assertEquals(result, "You entered: Shashank");



//        driver.quit();
    }
}
