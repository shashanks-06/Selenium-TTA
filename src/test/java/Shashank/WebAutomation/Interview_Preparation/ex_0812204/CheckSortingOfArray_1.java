package Shashank.WebAutomation.Interview_Preparation.ex_0812204;


import java.util.Arrays;

public class CheckSortingOfArray_1 {


    public static int[] sortArray(int[] array){

        int[] cloneArray = array.clone();   // Clone the original array to avoid modifying it

        for (int i = 0; i < cloneArray.length - 1; i++) {

            for (int j = 0; j <  cloneArray.length - 1; j++) {

                if (cloneArray[j] > cloneArray[j + 1]){
                    int temp = cloneArray[j];
                    cloneArray[j] = cloneArray[j + 1];
                    cloneArray[j + 1] = temp;
                }

            }
        }

        return cloneArray;
    }

    public static boolean checkSorting(int[] array, int[] sortedArray){
        return Arrays.equals(array, sortedArray);
    }

    public static void main(String[] args) {
        int[] unsortedOgArray = {0,3,4,5,1,2,6,7};
        int[] sortedArray = sortArray(unsortedOgArray);
        int[] sortedOgArray = {0, 1, 2, 3, 4, 5, 6, 7};

//        if (checkSorting(unsortedOgArray, sortedArray)){
//            System.out.println("Array is Already Sorted");
//        }else {
//            System.out.println("Array is Not Sorted");
//        }

        if (checkSorting(sortedOgArray, sortedArray)){
            System.out.println("Array is Already Sorted");
        }else {
            System.out.println("Array is Not Sorted");
        }
    }

}
