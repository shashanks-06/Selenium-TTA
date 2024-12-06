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
    static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] provideLoginData(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user" ,"secret_sauce"}
        };
    }

    @Test(dataProvider = "loginDataProvider")
    public void getTestLoginData(String username, String password){
        System.out.println("Username : " + username + " password : " + password);

        performLogin(username, password);
    }

    public static void performLogin(String username, String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
