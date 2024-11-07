package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T2_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium28_P3 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_Actions() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");

        // Wait for the popup to come and click the x icon
//        WebElement xButton = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
//
////        Explicitly Wait for the popup to come and click the x icon
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(xButton));
//
//        xButton.click();

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Wait until the element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        WebElement sourceInputField =  driver.findElement(By.id("fromCity"));

        Thread.sleep(3000);

        Actions actions = new Actions(driver);// Parameterized Constructor of Actions class to which driver passed
        actions.moveToElement(sourceInputField).click().sendKeys("Mumbai").build().perform();

//  1     -------------------------        ------------------------

//        WebElement dropdownElement  = driver.findElement(By.xpath(
//                "//p[normalize-space()='Mumbai, India']"));
//
//        actions.moveToElement(dropdownElement).click().build().perform();

//  2     -------------------------   OR    ------------------------

//        List<WebElement> dropdownList = driver.findElements(By.xpath(
//                "//ul[@class=\"react-autosuggest__suggestions-list\"]/li"
//        ));
//        for (WebElement element : dropdownList){
//            if (element.getText().contains("Mumbai")){
//                element.click();
//                break;
//            }
//        }

//  3     -------------------------   OR    ------------------------
        Thread.sleep(1000);

        actions.moveToElement(sourceInputField).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
