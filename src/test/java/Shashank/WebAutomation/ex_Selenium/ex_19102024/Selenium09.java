package Shashank.WebAutomation.ex_Selenium.ex_19102024;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium09 {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=800,600");
//        options.addArguments("--guest");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("189.91.85.133:31337");
//        proxy.setSslProxy("189.91.85.133:31337");  // For HTTPS connections
        options.setCapability("proxy", proxy);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();

    }
}
