package Shashank.WebAutomation.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium12 {

    @Description("Verify that the error message will come for the wrong email at the free trail in the app.vwo.com signup page.")
    @Test
    public void test_error_freeTrial() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial/");
        driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.id("page-v1-step1-email"));
        emailInputBox.sendKeys("fhds67328sb");

        WebElement policyCheckBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        policyCheckBox.click();

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        Thread.sleep(1000);

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        driver.quit();
    }
}
