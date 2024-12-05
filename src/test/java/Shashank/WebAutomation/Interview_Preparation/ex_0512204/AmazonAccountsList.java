package Shashank.WebAutomation.Interview_Preparation.ex_0512204;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonAccountsList {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.in");
    }

    @Test
    public void printAmazonAccountsList(){
        WebElement accountsListElement = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountsListElement).perform();

        WebElement amazonListsHeading = driver.findElement(By.id("nav-al-title"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(amazonListsHeading));

        List<WebElement> amazonLists = driver.findElements(By.xpath("//div[@id=\"nav-al-wishlist\"]/a/span"));

        System.out.println("\""+ amazonListsHeading.getText() + "\":");
        for (WebElement element : amazonLists){
            System.out.println(element.getText());
        }

        System.out.println("---------------------------------------");

        WebElement amazonAccountHeading = driver.findElement(By.xpath("//div[@id=\"nav-al-your-account\"]/div"));

        System.out.println("\""+ amazonAccountHeading.getText() + "\":");

        List<WebElement> amazonAccountList = driver.findElements(By.xpath("//div[@id=\"nav-al-your-account\"]/a/span"));

        for (WebElement element : amazonAccountList){
            System.out.println(element.getText());
        }

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
