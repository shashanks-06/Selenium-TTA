package Shashank.WebAutomation.Interview_Preparation.ex_0612204;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    }

    @DataProvider(name = "searchDataProvider")
    public Object[][] provideSearchData(){
        Object[][] searchData = new Object[2][1];
        searchData[0][0] = "Laptop";
        searchData[1][0] = "PS5";

        return searchData;
    }

    @Test(dataProvider = "searchDataProvider")
    public void getTestSearchData(String searchKeyword){
        WebElement searchElement = driver.findElement(By.cssSelector("[class=\"Pke_EE\"]"));
        searchElement.sendKeys(searchKeyword, Keys.ENTER);
    }



    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
