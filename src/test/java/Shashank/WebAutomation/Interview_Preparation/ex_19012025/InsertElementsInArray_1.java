package Shashank.WebAutomation.Interview_Preparation.ex_19012025;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementsInArray_1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the " + size + " elements to insert into the array.");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the Element to insert in the array: ");
        int element = sc.nextInt();

        System.out.print("Enter the position of the element: " + element + " to insert (1 to " + (size + 1) + "): ");
        int position = sc.nextInt();

        if (position < 1 || position > size + 1){
            System.out.println("Invalid Position !!!");
        }else{
            int[] newArray = new int[size + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position - 1){
                    newArray[i] = element;
                }else {
                    newArray[i] = array[j++];
                }
            }
            System.out.println(Arrays.toString(newArray));
        }


    }
}
