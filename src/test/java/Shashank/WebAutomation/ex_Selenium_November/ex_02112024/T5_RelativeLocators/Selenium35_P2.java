package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T5_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium35_P2 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_relativeLocators() throws InterruptedException {

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        driver.findElement(By.cssSelector("[id=\"search_city\"]")).sendKeys("India", Keys.ENTER);
        Thread.sleep(3000);

        List<WebElement> listOfCities = driver.findElements(By.xpath(
                "//table[@id=\"example\"]/tbody/tr/td[2]"));

        for (WebElement city : listOfCities){
            System.out.println(city.getText());

            String rightElement = driver.findElement(with(By.tagName("p")).toRightOf(city)).getText();
            String leftElement = driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
            String aboveElement = driver.findElement(with(By.tagName("p")).above(city)).getText();
            String belowElement = driver.findElement(with(By.tagName("p")).below(city)).getText();

            System.out.println(city.getText() + " | " + rightElement + " | " + leftElement);
            System.out.println(city.getText() + " | " + aboveElement + " | " + belowElement);

            System.out.println("===========================================");

        }


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}