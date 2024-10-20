package Shashank.WebAutomation.ex_Selenium.ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium05 {

    // get vs Navigate.to()

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

//        navigate().to() and get() -> both are exactly same

     driver.navigate().to("https://www.facebook.com");
     driver.navigate().to("https://www.instagram.com");
     driver.navigate().back();
     driver.navigate().forward();
     driver.navigate().refresh();

    }
}
