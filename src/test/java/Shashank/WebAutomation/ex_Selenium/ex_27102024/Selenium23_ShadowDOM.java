package Shashank.WebAutomation.ex_Selenium.ex_27102024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;

public class Selenium23_ShadowDOM {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify Shadow DOM")
    @Test
    public void test_shadowDom() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement scrollToDiv = driver.findElement(By.cssSelector("#userName"));
        js.executeScript("arguments[0].scrollIntoView(true);" , scrollToDiv);
//        OR
//        js.executeScript("window.scrollBy(0,1500)");

        Thread.sleep(5000);

        WebElement inputBoxPizza = (WebElement) js.executeScript(
                "return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza')"
        );
        assert inputBoxPizza != null;
        inputBoxPizza.sendKeys("farmhouse");

        String url = Objects.requireNonNull(js.executeScript("return document.URL")).toString();
        System.out.println("URL -> " + url);
        String title = Objects.requireNonNull(js.executeScript("return document.title")).toString();
        System.out.println("Title -> " + title);

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
