package Shashank.WebAutomation.Interview_Preparation.ex_13012025.TakingScreenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakingScreenshot {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        driver.get("https://omni.axisbank.co.in/axisretailbanking/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void takeFullPageScreenshot_TakesScreenshot(WebDriver driver){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_13012025/TakingScreenshot/screenshots/AxisBank_TakesScreenshot.jpg");
        source.renameTo(destination);
    }

    public static void takeFullPageScreenshot_AShot(WebDriver driver){

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);

        try {
            ImageIO.write(screenshot.getImage(), "PNG",
                    new File("src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_13012025/TakingScreenshot/screenshots/AxisBank_AShot/png"));
            System.out.println("Full Page Screenshot Saved!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test_takeScreenshot(){

        WebElement logo = driver.findElement(By.id("logo"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(logo));

//        takeFullPageScreenshot_TakesScreenshot(driver);
        takeFullPageScreenshot_AShot(driver);
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
