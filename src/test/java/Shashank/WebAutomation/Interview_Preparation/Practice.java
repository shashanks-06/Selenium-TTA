package Shashank.WebAutomation.Interview_Preparation;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Practice {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tutorialspoint.com/svg/graph.htm");
        Thread.sleep(2000);
    }


    @Test
    public void test(){

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src=\"/svg/src/graph.html\"]"));
        driver.switchTo().frame(frameElement);

        WebElement androidCircle = driver.findElement(By.xpath(
                "//*[@class=\"circle\"][9]//*[2]"));
        System.out.println(androidCircle.getText());
//div[@id='div1']//*[name()='svg']//*[name()='g'][18]/*[name()='text'][1]
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
