package Shashank.WebAutomation.ex_Selenium.ex_19102024;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium07 {
    public static void main(String[] args) {
        // Selenium 3.0  - JSON WIRE Protocol
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://sdet.live");

        // Selenium 4.0
        // Selenium manager - W3C protocol
        // Opera Removed - :)
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");
    }
}
