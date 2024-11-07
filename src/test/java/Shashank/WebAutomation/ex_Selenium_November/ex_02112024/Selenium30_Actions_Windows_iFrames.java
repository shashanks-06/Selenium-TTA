package Shashank.WebAutomation.ex_Selenium_November.ex_02112024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium30_Actions_Windows_iFrames {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("guest");
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
    }

    @Description("Verify Heatmap(app.vwo.com)")
    @Test
    public void test_heatmap_clickBtn() throws InterruptedException {
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

        Thread.sleep(3000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        List<WebElement> list_Heatmaps = driver.findElements(By.cssSelector("[data-qa=\"danawobuqa\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(list_Heatmaps.get(1)).click().build().perform();

        Thread.sleep(10000);
//        OR
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"VWO Logo\"]")));

        Set<String> windowHandleSet = driver.getWindowHandles();
        System.out.println("All Window Handles -> " + windowHandleSet);

        for (String handle : windowHandleSet){

            if (!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                System.out.println("New Child Title -> " + driver.getTitle());

                driver.switchTo().frame("heatmap-iframe");

                driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
            }
        }

//        To close the heatmap
        Thread.sleep(2000);
        driver.switchTo().window(parentWindowHandle);
//        /* OR */ -> driver.switchTo().defaultContent(); // To go to default parent window handle
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[class=\"btn btn--primary btn--link Fxs(0)\"]")).click();
        driver.findElement(By.cssSelector("[class=\"btn btn--link Fz(12px)\"]")).click();
        Thread.sleep(2000);

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
