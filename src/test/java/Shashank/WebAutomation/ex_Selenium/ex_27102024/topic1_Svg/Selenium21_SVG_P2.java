package Shashank.WebAutomation.ex_Selenium.ex_27102024.topic1_Svg;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class Selenium21_SVG_P2 {

WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--start-maximized");
        options.addArguments("guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify that the tripura is in india and click on it.")
    @Test
    public void test_svgIndiaMapAndClick(){
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        // local-name() , name()- Xpath (built in)

        List<WebElement> allStates = driver.findElements(By.xpath(
                "//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"
        ));

        for (WebElement state : allStates){
            System.out.println(state.getAttribute("aria-label"));

//            To click on Tripura
            if (Objects.requireNonNull(state.getAttribute("aria-label")).contains("Tripura")){
                state.click();
            }
        }

    }



    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
