package Shashank.WebAutomation.ex_Selenium_November.ex_02112024.T4_Upload_DragAndDrop;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium32_Upload {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Description("Verify that file is uploaded")
    @Test
    public void test_fileUpload() throws InterruptedException {
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String dir = System.getProperty("user.dir");
        System.out.println(dir);
//        C:\Users\shash\IdeaProjects\Selenium-TTA/src/test/java/Shashank/WebAutomation/ex_Selenium_November/ex_02112024/T4_Upload/Hello.txt
        String uploadFilePath = dir + "/src/test/java/Shashank/WebAutomation/ex_Selenium_November/ex_02112024/T4_Upload/Hello.txt";

        uploadFileInput.sendKeys(uploadFilePath);

        WebElement uploadFileClick = driver.findElement(By.xpath("//input[@name='submit']"));
        uploadFileClick.click();

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
