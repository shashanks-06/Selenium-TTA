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

    public static String reverse(String str){
        if (str == null || str.isEmpty()){
            System.out.println("Invalid");
        }

        assert str != null;
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words){
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();

    }


    public static void main(String[] args) {
        System.out.println(reverse("Test Automation"));
    }


//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
