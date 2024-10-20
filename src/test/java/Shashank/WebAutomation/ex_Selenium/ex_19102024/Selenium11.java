package Shashank.WebAutomation.ex_Selenium.ex_19102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium11 {
    @Test
    public void testVwoLinkText() throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com");

        // Link Text - Full Match
        // and Partial Only work -  Contains - Partial Match
        //
        // a tag
        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">
        // Start a free trial
        //
        // </a>

//        linkText()
//        WebElement linkElement = driver.findElement(By.linkText("Start a free trial"));
//        linkElement.click();

//        partialLinkText()
        WebElement partialLinkElement = driver.findElement(By.partialLinkText("free trial"));
        partialLinkElement.click();

        Thread.sleep(1000);

        driver.quit();

    }
}
