package Shashank.WebAutomation.Interview_Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Practice {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--guest");

        driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test_Amazon(){

        Actions act = new Actions(driver);

        WebElement accountsAndListsElement = driver.findElement(By.xpath(
                "//div[@class=\"nav-line-1-container\"]"));

        act.moveToElement(accountsAndListsElement).perform();

        WebElement signInBtnElement = driver.findElement(By.className("nav-action-inner"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(signInBtnElement));

        String yourListsHeading = driver.findElement(By.id("nav-al-title")).getText();
        List<WebElement> yourLists = driver.findElements(By.xpath("//div[@id=\"nav-al-wishlist\"]//span"));

        System.out.println("\"" + yourListsHeading + "\" :");
        for (WebElement listItem : yourLists){
            System.out.println(listItem.getText());
        }

        System.out.println("=====================================================");

        String yourAccountsHeading = driver.findElement(By.xpath(
                "//div[@id=\"nav-al-your-account\"]//div")).getText();
        List<WebElement> yourAccounts = driver.findElements(By.xpath(
                "//div[@id=\"nav-al-your-account\"]//span"));

        System.out.println("\"" + yourAccountsHeading + "\" :");
        for (WebElement listItem : yourAccounts){
            System.out.println(listItem.getText());
        }

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
