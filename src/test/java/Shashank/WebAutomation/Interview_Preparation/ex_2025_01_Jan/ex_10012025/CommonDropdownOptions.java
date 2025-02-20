package Shashank.WebAutomation.Interview_Preparation.ex_2025_01_Jan.ex_10012025;

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

public class CommonDropdownOptions {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void open1stWebsite(){
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    }

    public void open2ndWebsite(){

        String url = "https://practice.expandtesting.com/dropdown";

//        Execute JavaScript to open the link in a new tab by simulating a click while using window.open().
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open(arguments[0], '_blank');", url);

//        window.open(arguments[0], '_blank'); is used to open the URL in a new tab.
//        arguments[0] is directly the url string.
    }

    public Set<String> getOptionsOf1st(){

        WebElement firstDropdown = driver.findElement(By.xpath(
                "//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select"
        ));

        Select select_1stDd = new Select(firstDropdown);

        // Store options as a Set of Strings for easy comparison
        Set<String> firstOptionsSet = new HashSet<>();

        for (WebElement option : select_1stDd.getOptions()){
            firstOptionsSet.add(option.getText());
        }

        return firstOptionsSet;
    }

    public Set<String> getOptionsOf2nd(){

        WebElement secondDropdown = driver.findElement(By.id("country"));

        Select select_2ndDd = new Select(secondDropdown);

        // Store options as a Set of Strings
        Set<String> secondOptionsSet = new HashSet<>();

        for (WebElement option : select_2ndDd.getOptions()){
            secondOptionsSet.add(option.getText());
        }

        return secondOptionsSet;
    }

    public List<String> windowHandler(){
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String mainTab = iterator.next();   // First tab (current)
        String newTab = iterator.next();    // Second tab (newly opened)

        List<String> stringList = new ArrayList<>();
        stringList.add(mainTab);
        stringList.add(newTab);

        return stringList;
    }

    @Test
    public void test_commonDdOptions() throws InterruptedException {

        open1stWebsite();

        Set<String> firstDropdownOptions = getOptionsOf1st();

        Thread.sleep(1000);

        open2ndWebsite();

        //  Switch to the new tab
        driver.switchTo().window(windowHandler().get(1));

        Set<String> secondDropdownOptions = getOptionsOf2nd();
        Thread.sleep(1000);

//      retainAll() method from the Set interface to find common elements.
        firstDropdownOptions.retainAll(secondDropdownOptions);

        System.out.println("Common Options are as follows:");
        System.out.println(firstDropdownOptions);
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
