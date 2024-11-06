package Shashank.WebAutomation.ex_Selenium.ex_02112024_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium25 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Test
    public void test_webTables(){
        driver.get("https://awesomeqa.com/webtable1.html");

       WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

//       For rows and columns

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size() ; i++) {
            List<WebElement> col = rows.get(i).findElements(By.tagName("td"));

            for (WebElement element : col){
                System.out.println(element.getText());
            }
        }

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
