package Shashank.WebAutomation.Interview_Preparation.ex_2025_03_Mar.ex_04032025;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonSponsoredItems {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new EdgeDriver(options);
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test_getSponsoredItems(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Boots", Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//span[@class=\"_bGlmZ_ad-feedback-text-desktop_q3xp_\"]")));
        }catch (TimeoutException e){
            System.out.println("No Sponsored Items Present" + e.getMessage());
        }

        List<WebElement> sponsoredItemsList = driver.findElements(By.xpath(
                "//div[contains(@class, \"_bGlmZ_img_3idRh\")]//img"));

        for (WebElement sponsoredItem : sponsoredItemsList){
            System.out.println(sponsoredItem.getAttribute("alt"));
        }


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}
