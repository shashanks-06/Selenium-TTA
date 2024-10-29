package Shashank.WebAutomation.ex_Selenium.ex_26102024_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Shashank.WebAutomation.ex_Selenium.ex_26102024_SeleniumWaits.Selenium17_WaitHelpers.checkVisibilityByFluentWaitUsingWebElement;

// FluentWait used to check the element in the intervals

public class Selenium17_FluentWait {

    @Test
    public void test_vwo_FluentWait(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passInputBox = driver.findElement(By.name("password"));
        passInputBox.sendKeys("password@321");

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        WebElement errorMsgBox = driver.findElement(By.cssSelector("#js-notification-box-msg"));
//        System.out.println(errorMsgBox.getText());

//      Condition
//        Wait <WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .withMessage("Waiting for Chrome to finish...")
//                .ignoring(NoSuchElementException.class);
//
////        Element should be present
//        wait.until(ExpectedConditions.visibilityOf(errorMsgBox));
//
////        Text in Element should be present
//        wait.until(ExpectedConditions.textToBePresentInElement(
//                errorMsgBox, "Your email, password, IP address or location did not match"));
//
//        WebElement errorMessage = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver webDriver) {
//                return driver.findElement(By.cssSelector("#js-notification-box-msg"));
//            }
//        });

//        --------------------------------------------------------------------------------------------------------------------

//        Now using WaitHelpers Utility Function
//        checkVisibilityByFluentWaitUsing -> Locator
//        WebElement errorMessage = checkVisibilityByFluentWaitUsingLocator(driver,
//                By.className("notification-box-description"));

//        checkVisibilityByFluentWaitUsing -> WebElement
        WebElement errorMessage = checkVisibilityByFluentWaitUsingWebElement(driver, errorMsgBox);


        Assert.assertEquals(errorMessage.getText(),
                "Your email, password, IP address or location did not match");


        driver.quit();

    }
}
