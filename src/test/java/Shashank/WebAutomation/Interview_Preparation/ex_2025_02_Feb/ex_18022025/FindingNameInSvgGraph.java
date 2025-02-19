package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_18022025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindingNameInSvgGraph {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tutorialspoint.com/svg/graph.htm");
        Thread.sleep(2000);
    }


    @Test
    public void test_printWebChart(){
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src=\"/svg/src/graph.html\"]"));
        driver.switchTo().frame(frameElement);

//        WebElement androidCircle = driver.findElement(By.xpath(
//                "//*[@class=\"circle\"][9]//*[2]")); // Android
//        System.out.println(androidCircle.getText());
//div[@id='div1']//*[name()='svg']//*[name()='g'][18]/*[name()='text'][1]

        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"circle\"]//*[2]"));

        System.out.println("Web Chart:");
        for (WebElement nameElement : list){
            System.out.print(nameElement.getText() + "\t");
        }

        driver.switchTo().defaultContent();
    }

    @Test(dependsOnMethods = "test_printWebChart")
    public void test_printZinoChart(){
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src=\"/svg/src/graph1.html\"]"));
        driver.switchTo().frame(frameElement);

        List<WebElement> yAxisList = driver.findElements(By.xpath(
                "//div[@id='chart']//*[name()='svg']//*[name()='g'][4]//*[@font-size=\"12px\"]//*[@alignment-baseline=\"middle\"]"));
        //*[@class="zui-chart-labels zui-chart-labels-y"]//*[@text-anchor="end"]//*[text()='3']

        System.out.println("Zino Chart Y-Axis : ");
        for (WebElement element : yAxisList){
            System.out.print(element.getText() + "\t");
        }

        System.out.println();

        List<WebElement> xAxisList = driver.findElements(By.xpath(
                "//div[@id='chart']//*[name()='svg']//*[name()='g'][5]//*[@font-size=\"12px\"]"));

        System.out.println("Zino Chart X-Axis: ");
        for (WebElement element : xAxisList){
            System.out.print(element.getText() + "\t");
        }

        driver.switchTo().defaultContent();

        System.out.println();
    }

    @Test(dependsOnMethods = "test_printZinoChart")
    public void test_printZinoSurfaceChart(){
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src=\"/svg/src/graph2.html\"]"));

        driver.switchTo().frame(frameElement);

        List<WebElement> yAxisElement = driver.findElements(By.xpath(
                "//div[@id='chart']//*[name()='svg']//*[name()='g'][4]//*[@font-size=\"12px\"]//*[@alignment-baseline=\"middle\"]"));

        System.out.println("Zino Surface Chart Y-Axis : ");
        for (WebElement element : yAxisElement){
            System.out.print(element.getText() + "\t");
        }

        System.out.println();

        List<WebElement> xAxisElements = driver.findElements(By.xpath(
                "//div[@id='chart']//*[name()='svg']//*[name()='g'][5]//*[@font-size=\"12px\"]"));

        System.out.println("Zino Surface Chart X-Axis");
        for (WebElement element : xAxisElements){
            System.out.print(element.getText() + "\t");
        }

        driver.switchTo().defaultContent();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
