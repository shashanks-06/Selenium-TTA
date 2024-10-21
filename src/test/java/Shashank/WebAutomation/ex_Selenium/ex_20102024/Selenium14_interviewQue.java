package Shashank.WebAutomation.ex_Selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium14_interviewQue {
    @Description("Verify that Free trial expire message in idrive360.com")
    @Test
    public void test_ebay_prices() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.ebay.com/");
//      driver.manage().window().maximize();



        WebElement searchboxField = driver.findElement(By.cssSelector("input#gh-ac"));
//        Or -> input[id='gh-ac']
        searchboxField.sendKeys("imac", Keys.ENTER);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print all the titles
        List<WebElement> titlesList = driver.findElements(By.cssSelector(".s-item__title"));
        //div[@class="s-item__title"]/span -> 62

        List<WebElement> priceList = driver.findElements(By.cssSelector(".s-item__price"));
        //span[@class="s-item__price"] -> 64

        int size = Math.min(titlesList.size(), priceList.size());
        for (int i = 0; i < size; i++) {
            System.out.println("Title: " +titlesList.get(i).getText() + " || " + "Price: " + priceList.get(i).getText());
        }



    }
}
