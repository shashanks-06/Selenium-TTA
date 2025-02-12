package Shashank.WebAutomation.Interview_Preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
import java.util.Arrays;


public class Practice {
//    WebDriver driver;
//    @BeforeTest
//    public void setUp() throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.flipkart.com");
//        Thread.sleep(2000);
//    }

    public static int[] removeDuplicates(int[] arr){
        int n = arr.length;

        if (n == 0 || n == 1) return arr;

        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                temp[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4};
        int[] result = removeDuplicates(array);

        System.out.println(Arrays.toString(result));
    }

//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
