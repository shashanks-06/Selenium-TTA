package Shashank.WebAutomation.Interview_Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;


public class Practice {

    WebDriver driver;
    Select select;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("guest");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void open1stWebsite(){
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    }

    public void open2ndWebsite(){
        String url = "https://practice.expandtesting.com/dropdown";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open(arguments[0], '_blank');", url);
    }

    public List<String> get1stWebOptions(){
        WebElement dropdownElement = driver.findElement(By.xpath(
                "//div[@rel-title=\"Select Country\"]//select"));

        select = new Select(dropdownElement);
        List<String> list = new ArrayList<>();

        for (WebElement option : select.getOptions()){
            list.add(option.getText());
        }

        return list;
    }


    public List<String> get2ndWebOptions(){
        WebElement dropdownElement = driver.findElement(By.id("country"));

        select = new Select(dropdownElement);

        List<String> list = new ArrayList<>();

        for (WebElement options : select.getOptions()){
            list.add(options.getText());
        }

        return list;
    }

    public List<String> windowHandler(){
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> itr = allWindowHandles.iterator();
        String mainTab = itr.next();
        String newTab = itr.next();

        List<String> windows = new ArrayList<>();
        windows.add(mainTab);
        windows.add(newTab);

        return windows;
    }

    @Test
    public void test_commonOptions(){
        open1stWebsite();

        List<String> list1 = get1stWebOptions();

        open2ndWebsite();

        driver.switchTo().window(windowHandler().get(1));

        List<String> list2 = get2ndWebOptions();

        list1.retainAll(list2);

        System.out.println("Common options in between the 2 Dropdowns : ");
        System.out.println(list1);
    }

    @AfterTest
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }





}
