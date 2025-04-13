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

    static Scanner sc = new Scanner(System.in);

    public static int[] createArray(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] addElementAtPosition(int element, int position){
        System.out.println("Enter the size of array to create: ");
        int size = sc.nextInt();
        int[] array = createArray(size);
        System.out.println("Original Array: " + Arrays.toString(array));

        if (position < 1 || position > size + 1){
            System.out.println("Invalid Position !");
        }else {
            int[] result = new int[size + 1];

            for (int i = 0, j = 0; i < result.length; i++) {
                if (i == position - 1){
                    result[i] = element;
                }else {
                    result[i] = array[j++];
                }
            }
            return result;
        }
        return new int[]{};
    }

    public static int[] addElementInArray(int[] array){
        int size = array.length;

        System.out.println("Enter the Element to add: ");
        int element = sc.nextInt();
        System.out.println("Enter the position of element " + element + " to add in the array: ");
        int position = sc.nextInt();

        if (position < 1 || position > size + 1){
            System.out.println("Invalid Position !!!");
        }else {
            int[] result = new int[size + 1];

            for (int i = 0, j = 0; i < result.length ; i++) {
                if (i == position - 1){
                    result[i] = element;
                }else {
                    result[i] = array[j++];
                }
            }

            return result;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
//        int[] array = addElementAtPosition(3,3);
//        System.out.println("Modified Array: " + Arrays.toString(array));

        int[] array = createArray(6);
        System.out.println(Arrays.toString(array));

        int[] result = addElementInArray(array);
        System.out.println(Arrays.toString(result));
    }


}
