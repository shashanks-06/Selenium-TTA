package Shashank.WebAutomation.ex_SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444"), desiredCapabilities);

        driver.get("www.example.com");
        System.out.println("Web Page Title: " + driver.getTitle());
        driver.quit();

    }
}
