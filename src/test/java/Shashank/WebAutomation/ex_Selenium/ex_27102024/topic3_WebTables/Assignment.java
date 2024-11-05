package Shashank.WebAutomation.ex_Selenium.ex_27102024.topic3_WebTables;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.PropertyReader;

import java.io.File;
import java.io.IOException;


public class Assignment {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new EdgeDriver(options);
    }

    @Test
    public void loginToOrangeHrm() throws InterruptedException {

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);

        String username = PropertyReader.readKey("webTableAssignment.username");
        String password = PropertyReader.readKey("webTableAssignment.password");


        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(dependsOnMethods = "loginToOrangeHrm")
    public void test_orangeHrmTable() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        Thread.sleep(2000);

       int row = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]")).size();
        System.out.println(row);

        int col = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"][1]/div/div")).size();
        System.out.println(col);

        String firstPart = "//div[@class=\"oxd-table-card\"][";
        String secondPart = "]/div/div[";
        String thirdPart = "]/div";

        for (int i = 1; i <= row ; i++) {
            for (int j = 2; j <= col ; j++) {
                String dynamicXpath = firstPart + i + secondPart + j + thirdPart;
                String data = driver.findElement(By.xpath(dynamicXpath)).getText();
//                System.out.println(data);     // To Print all data from web table

                if (data.contains("Terminated")){
                    String deleteBtnXpath = "//div[@class=\"oxd-table-card\"][" + i + "]/div/div[9]/div/button[1]";
                    driver.findElement(By.xpath(deleteBtnXpath)).click();

                    TakesScreenshot screenshot = (TakesScreenshot) driver;
                    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
                    File destFile = new File("src/test/java/Shashank/WebAutomation/ex_Selenium/ex_27102024/topic3_WebTables/deletion_screenshot.png");

                    try {
                        FileHandler.copy(srcFile, destFile);
                        System.out.println("Screenshot Taken : " + destFile.getAbsolutePath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
//                    Thread.sleep(1000);
//
//                    String cancelBtnXpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin\"]";
//                    driver.findElement(By.xpath(cancelBtnXpath)).click();

                    return;  // Exit the method after finding the first match
                }
            }
        }

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
