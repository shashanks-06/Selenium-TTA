package Shashank.WebAutomation.Interview_Preparation;


import java.util.Arrays;

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

    public static void reverse(int[] arr, int start, int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rightShiftArray(int[] arr, int k){
        int n = arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr,0, k - 1);
        reverse(arr, k, n -1);
    }

    public static void leftShiftArray(int[] arr, int k){
        int n = arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n-1);
        reverse(arr,0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int steps = 3;
//        rightShiftArray(arr, steps);
        leftShiftArray(arr, steps);
        System.out.println(Arrays.toString(arr));
    }


//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
