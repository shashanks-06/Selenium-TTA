package Shashank.WebAutomation.ex_Selenium.ex_26102024_SeleniumWaits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium15 {
    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative() throws InterruptedException {

        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath

// <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        options.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passInputBox = driver.findElement(By.name("password"));
        passInputBox.sendKeys("password@321");

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

//        After 3 seconds the error comes
//            Thread.sleep(3000);

        WebElement errorMsgBox = driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMsgBox.getText());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

//        Element should be present
        wait.until(ExpectedConditions.visibilityOf(errorMsgBox));

//        Text in Element should be present
        wait.until(ExpectedConditions.textToBePresentInElement(
                errorMsgBox, "Your email, password, IP address or location did not match"));

        Assert.assertEquals(errorMsgBox.getText(), "Your email, password, IP address or location did not match");

        driver.quit();


    }
}
