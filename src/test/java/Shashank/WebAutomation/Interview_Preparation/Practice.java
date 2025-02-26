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

    public static void reverse(String str){
        if (str == null || str.isEmpty()){
            System.out.println("Invalid");
        }

        assert str != null;
        String[] words = str.split(" ");

        for (String word : words){
            char[] charArray = word.toCharArray();

            int left = 0, right = charArray.length - 1;

            while (left < right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
            System.out.print(new String(charArray) + " ");
        }
    }


    public static void main(String[] args) {
        String str = "Test Automation";
        reverse(str);
    }


//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
