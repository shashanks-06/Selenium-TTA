package Shashank.WebAutomation.ex_Selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium13 {
    @Description("Verify that Free trial expire message in idrive360.com")
    @Test
    public void test_verify_expire_message() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.idrive360.com/enterprise/login");
//      driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// <input
        // _ngcontent-qcv-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">

        WebElement usernameInput_id = driver.findElement(By.id("username"));
//        WebElement usernameInput_name = driver.findElement(By.name("username"));
//        WebElement usernameInput_cssSelector_1 = driver.findElement(By.cssSelector("input#username"));
//        WebElement usernameInput_cssSelector_2 = driver.findElement(By.cssSelector("#username"));
//        WebElement usernameInput_xPath = driver.findElement(By.xpath("//input[@id=\"username\"]"));

        usernameInput_id.sendKeys("augtest_040823@idrive.com");

        WebElement passwordInput_xPath = driver.findElement(By.xpath("//input[@type=\"password\"]"));

        passwordInput_xPath.sendKeys("123456");

        WebElement span_checkbox = driver.findElement(By.className("id-checkmark"));
        span_checkbox.click();

        WebElement submitButton = driver.findElement(By.cssSelector("div.id-frm-btnblk > button"));
        submitButton.click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.cssSelector("h5.id-card-title"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your free trial has expired");

        driver.quit();
    }
}
