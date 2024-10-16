package Shashank.WebAutomation.ex_Selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

// WE'RE USING SELENIUM VERSION 4.25  -->> IMPORTANT

public class Selenium01 {
    //Import Concept of OOPs ->
    // Upcasting -> Dynamic Dispatch - Poly

    // Selenium - Arch - API
    // Create Session, Commands or Functions -> API Request to Browser Driver (
    // Pass the commands as API

    // In Selenium 3 -
    // System.setProperty("webDriver.chrome.driver", "/path/to/chromedriver");

    // In Selenium 4
    // Opera Remove - No usage of the setProperty

//    WebDriver driver1 = new ChromeDriver();
//    WebDriver driver2 = new FirefoxDriver();
//    WebDriver driver3 = new EdgeDriver();
//    WebDriver driver4 = new SafariDriver();
//    WebDriver driver5 = new InternetExplorerDriver();

    // SearchContext - Interface - findElement, and findElements - GGF
    // WebDriver - Interface - some incomplete functions - GF
    // RemoteWebDriver - Class- It also has some functions - F
    // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

//    SearchContext driverSC = new ChromeDriver();
//    WebDriver driverWeb = new ChromeDriver();
//    RemoteWebDriver driverRW = new ChromeDriver();
//    driverRW = new EdgeDriver();


    // SCENARIOS

    // 1. Do want to run on  Chrome or Edge?
    //ChromeDriver driver = new ChromeDriver(); ~1%

    // 2  Do you want to run on Chrome then change to Edge ?
// 97%  WebDriver driver = new ChromeDriver();
    // driver = new EdgeDriver();


    // 3. do you want to run on multiple browsers, aws machine ? 2%
    // RemoteWebDriver driver (with Selenium GRID) - Advance (Last 2 Sessions)
}
