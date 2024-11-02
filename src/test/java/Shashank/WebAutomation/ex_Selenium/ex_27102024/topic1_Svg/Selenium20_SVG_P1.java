package Shashank.WebAutomation.ex_Selenium.ex_27102024.topic1_Svg;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium20_SVG_P1 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify that the after search, results are visible.")
    @Test
    public void test_flipkartSearch(){

        driver.get("https://www.flipkart.com");

        // Step 1 - Enter the "macmini" in the inputbox.
        driver.findElement(By.name("q")).sendKeys("macmini");

        // Step 2 - Click on the svg element.

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
//        //*[local-name()='svg']
        svgElements.get(0).click();

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for (WebElement title : titlesResults){
            System.out.println(title.getText());
        }

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}

