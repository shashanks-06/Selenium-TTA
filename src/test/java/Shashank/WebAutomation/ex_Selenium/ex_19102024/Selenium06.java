package Shashank.WebAutomation.ex_Selenium.ex_19102024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium06 {
    public static void main(String[] args) {

        //Import Concept of OOPs in Selenium Webdriver->
//        WebDriver driver1 = new ChromeDriver();
//        WebDriver driver2 = new EdgeDriver();
//        WebDriver driver3 = new InternetExplorerDriver();
//        WebDriver driver4 = new FirefoxDriver();
//        WebDriver driver5 = new SafariDriver();

        //   Opera - Selenium 4- Removed!

        // SearchContext(I) (2)
        // -> WebDriver(I)( 10)
        // -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25
        // -> EdgeDriver(C) (45)
        // -> ChromeDriver(C)

//        SearchContext driver = new ChromeDriver();  // Dynamic Dispatch (RunTime Polymorphism) | upcasting
        // Possible but two functions, which is not much used.
        //driver.findElement()
        //driver.findElements()

        //         WebDriver driver = new EdgeDriver();
//        // 12 which are good

//         RemoteWebDriver driver = new EdgeDriver();

//        EdgeDriver driver = new EdgeDriver();


        // Scenarios
        // 1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver2 = new EdgeDriver();

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();  // 90%


        // 3. Do you want to run on multiple browsers /machine? 10%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


    }
}
