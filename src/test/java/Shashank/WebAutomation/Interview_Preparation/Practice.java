package Shashank.WebAutomation.Interview_Preparation;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
//    WebDriver driver;
//
//    @BeforeTest
//    public void setUp() throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.tutorialspoint.com/svg/graph.htm");
//        Thread.sleep(2000);
//    }

    public static void maximizeInt(int[] array){

        int n = array.length;

        for (int i = n - 1; i >= 0 ; i--) {

            if (array[i] != 9){
                array[i]++;

                for (int j = i + 1; j < n ; j++) {
                    array[j] = 0;
                }
                return;
            }
        }

    }


    public static void main(String[] args) {
        int[] array = {1, 2, 9};
        maximizeInt(array);

        System.out.println(Arrays.toString(array));
    }





//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
