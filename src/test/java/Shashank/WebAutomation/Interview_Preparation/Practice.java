package Shashank.WebAutomation.Interview_Preparation;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

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



    public static void main(String[] args) throws IOException {

        String PATH = "src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_15012025/testData.xlsx";

        FileInputStream file = new FileInputStream(PATH);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
//
        int totalRows = sheet.getLastRowNum();
        System.out.println("Total Rows : " + totalRows);

        int totalColumns = sheet.getRow(0).getLastCellNum();
        System.out.println("Total Columns : " + totalColumns);
//
        for (int i = 0; i <= totalRows; i++) {
            XSSFRow currentRow = sheet.getRow(i);
            System.out.print(i + " -> ");
            for (int j = 0; j < totalColumns; j++) {
                XSSFCell cell = currentRow.getCell(j);
                System.out.print(cell + " | ");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }

//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
