package Shashank.WebAutomation.Interview_Preparation.ex_0912204;

import java.util.Arrays;

// Find the largest, 2nd largest and smallest elements from integer array

public class ElementsFromArray {

    public static void descSortArray(int[] array){

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int getLargestOfArray(int[] array){
        return array[0];
    }

    public static int getSecondLargestOfArray(int[] array){
        return array[1];
    }

    public static int getSmallestOfArray(int[] array){
        int lastIndex = array.length - 1;
        return array[lastIndex];
    }


    public static void main(String[] args) {
        int[]array = {4, 6, 1, 9, 2, 3, 7, 5, 0};
        descSortArray(array);
        System.out.println("Descending Sorted Array" + Arrays.toString(array));

        System.out.println("Largest Element of Array : " + getLargestOfArray(array));

        System.out.println("Second Largest Element of Array : " + getSecondLargestOfArray(array));

        System.out.println("Smallest Element of Array : " + getSmallestOfArray(array));
    }

}
