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

        WebElement sponsoredBannerName = driver.findElement(By.xpath(
           "//a[@aria-label=\"AFROJACK Boots for Men\"]//span//span[@class=\"a-truncate-cut\"]"));

        System.out.println("Sponsored Company Name : " + sponsoredBannerName.getText());

        List<WebElement> sponsoredBannerItemsList = driver.findElements(By.xpath(
                "//div[contains(@class, \"_bGlmZ_img_3idRh\")]//img"));

        for (WebElement sponsoredItem : sponsoredBannerItemsList){
            System.out.println(sponsoredItem.getAttribute("alt"));
        }

        System.out.println();
        System.out.println("Sponsored Products Name : ");

        List<WebElement> sponsoredItemsList = driver.findElements(By.xpath(
                "//div[@data-component-type=\"s-search-result\"][.//span[contains(text(),'Sponsored')]]//h2//span"));

        for (int i = 0; i < sponsoredItemsList.size(); i++) {
            System.out.print(sponsoredItemsList.get(i).getText() + "  ");

            if ((i + 1) % 2 == 0){
                System.out.println();
            }
        }


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}
