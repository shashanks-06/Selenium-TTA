package Shashank.WebAutomation.Interview_Preparation.ex_15012025;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) {

        String FILE_PATH = "src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_15012025/testData.xlsx";

        try (FileInputStream file = new FileInputStream(FILE_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet){
                for (Cell cell : row){
                    switch (cell.getCellType()){

                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;

                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;

                        default:
                            System.out.print("Unknown Format \t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
