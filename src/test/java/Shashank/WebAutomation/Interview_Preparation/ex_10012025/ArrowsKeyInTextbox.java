package Shashank.WebAutomation.Interview_Preparation.ex_10012025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

// How will you send the up and down arrow keys as input in a textbox?

public class ArrowsKeyInTextbox {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void test_arrowKeys() throws InterruptedException {

        WebElement searchInput = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));

//        searchInput.click();

        Actions act = new Actions(driver);

        act.moveToElement(searchInput).perform();

        act.moveToElement(searchInput).sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        searchInput.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);

        searchInput.sendKeys(Keys.ARROW_UP);
        Thread.sleep(2000);

        searchInput.sendKeys(Keys.ENTER);


    }

    @AfterMethod
    public void tearDown(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
