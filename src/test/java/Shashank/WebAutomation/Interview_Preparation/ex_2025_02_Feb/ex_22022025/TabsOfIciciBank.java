package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_22022025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TabsOfIciciBank {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new EdgeDriver(options);
        driver.get("https://www.icicibank.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test_printTabNames(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[class=\"logo-image sprite-img logo-image logo-india\"]")));

        List<WebElement> tabNames = driver.findElements(By.xpath(
                "//ul[@class=\"mega-menu-items\"]//span[@class=\"menu-txt\"]"));

        for (WebElement tabs : tabNames){
            System.out.println(tabs.getText());
        }

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
