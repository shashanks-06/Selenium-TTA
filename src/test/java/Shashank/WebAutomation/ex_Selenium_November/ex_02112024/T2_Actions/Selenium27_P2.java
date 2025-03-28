package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T2_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium27_P2 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_Actions(){
        driver.get("https://www.spicejet.com/");

        WebElement sourceInputField =  driver.findElement(By.
                xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));


        Actions actions = new Actions(driver);      // Parameterized Constructor of Actions class to which driver passed

        actions.moveToElement(sourceInputField).click().sendKeys("BLR").build().perform();
        

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
