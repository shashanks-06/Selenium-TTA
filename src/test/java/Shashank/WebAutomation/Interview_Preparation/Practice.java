package Shashank.WebAutomation.Interview_Preparation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Practice {


    public static void main(String[] args) {

        String FILE_PATH = "src/test/java/Shashank/WebAutomation/Interview_Preparation/ex_2025_01_Jan/ex_15012025/testData.xlsx";

        try(FileInputStream file = new FileInputStream(FILE_PATH)){

            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row r : sheet){
                for (Cell c : r){
                    switch (c.getCellType()){
                        case STRING:
                            System.out.print(c.getStringCellValue() + "   ");
                            break;

                        case NUMERIC:
                            System.out.print(c.getNumericCellValue() + "   ");
                            break;

                        case BOOLEAN:
                            System.out.print(c.getBooleanCellValue() + "   ");
                            break;

                        default:
                            System.out.print("Illegal Format    ");
                            break;
                    }
                }
                System.out.println();
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }


}
