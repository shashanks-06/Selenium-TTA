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

    public static void occurrence(String str){
        if (str == null || str.isEmpty()){
            System.out.println("Invalid");
        }

        assert str != null;
        str = str.replace(" ", "").toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0', minChar = '\0';
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            char character = entry.getKey();

            if (count > maxFreq){
                maxFreq = count;
                maxChar = character;
            }

            if (count < minFreq){
                minFreq = count;
                minChar = character;
            }
        }

        System.out.println(maxChar + " : " + maxFreq);
        System.out.println(minChar + " : " + minFreq);

    }


    public static void main(String[] args) {
        String string = "Teeeessst Autoooooomationn";
        occurrence(string);
    }





//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
