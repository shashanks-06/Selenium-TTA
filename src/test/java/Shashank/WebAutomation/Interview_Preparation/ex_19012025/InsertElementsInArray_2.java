package Shashank.WebAutomation.Interview_Preparation.ex_19012025;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementsInArray_2 {

    static Scanner sc = new Scanner(System.in);

    public static int[] createArrayWithSize(int size){

        int[] array = new int[size];

        System.out.println("Enter the " + size + " elements to insert.");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] addElementAtPosition(int[] array) {
        int size = array.length;

        System.out.print("Enter the element to add in the array: ");
        int element = sc.nextInt();

        System.out.print("Enter the position to insert element: " + element + " from 1 to " + (size + 1) + " : ");
        int position = sc.nextInt();

        if (position < 1 || position > size + 1){
            System.out.println("Invalid Position !!!");
        }else {
            int[] newArray = new int[size + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position - 1){
                    newArray[i] = element;
                }else {
                    newArray[i] = array[j++];
                }
            }
            return newArray;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] createdArray = createArrayWithSize(6);
        System.out.println(Arrays.toString(createdArray));

        int[] newArray = addElementAtPosition(createdArray);
        System.out.println(Arrays.toString(newArray));
    }
}
