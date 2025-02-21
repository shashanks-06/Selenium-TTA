package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_21022025;

import java.util.Arrays;

public class InsertElementInArray_1 {

    public static int[] insertElement(int[] array, int index, int valueToInsert){

        if (index < 0 || index >= array.length + 1){
            System.out.println("Index " + index + " is out of bounds");
            return new int[]{};
        }

        int[] newArray = new int[array.length + 1];

//        for (int i = 0; i < index; i++) {
//            newArray[i] = array[i];
//        }
//        OR
        System.arraycopy(array, 0, newArray, 0, index);


        newArray[index] = valueToInsert;


//        for (int i = index; i < array.length ; i++) {
//            newArray[i+1] = array[i];
//        }
//        OR
        System.arraycopy(array, index, newArray, index + 1, array.length - index);

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int value = 25;
        int index = 2;

        int[] result = insertElement(arr, index, value);

        System.out.println(Arrays.toString(result));
    }
}
