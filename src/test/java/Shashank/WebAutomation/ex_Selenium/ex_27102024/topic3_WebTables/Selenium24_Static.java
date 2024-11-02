package Shashank.WebAutomation.ex_Selenium.ex_27102024.topic3_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium24_Static {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new EdgeDriver(options);
    }

    @Description("Verify Web Tables")
    @Test
    public void test_webTables(){
        driver.get("https://awesomeqa.com/webtable.html");

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        System.out.println(row);

        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        System.out.println(col);

        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String firstPart = "//table[@id=\"customers\"]/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        for (int i = 2; i <= row ; i++) {
            for (int j = 1; j <= col ; j++) {
                String dynamicXpath = firstPart + i + secondPart + j + thirdPart;
                String data = driver.findElement(By.xpath(dynamicXpath)).getText();
//                System.out.println(data);     // To print all table data

                if (data.contains("Helen Bennett")){
                    String company_xPath = dynamicXpath + "/preceding-sibling::td";
                    String country_xPath = dynamicXpath + "/following-sibling::td";

                    String company = driver.findElement(By.xpath(company_xPath)).getText();
                    String country = driver.findElement(By.xpath(country_xPath)).getText();

                    System.out.println("Helen Bennett's Company -> " +company);
                    System.out.println("Helen Bennett's Country -> " +country);

                }
            }
        }

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
