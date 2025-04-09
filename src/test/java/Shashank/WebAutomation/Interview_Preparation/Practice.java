package Shashank.WebAutomation.Interview_Preparation;

import java.util.*;


public class Practice {

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k= 0;

        while (i < m && j < n){
            if (array1[i] < array2[j]){
                mergedArray[k++] = array1[i++];
            }else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < m){
            mergedArray[k++] = array1[i++];
        }

        while (j < n){
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }


    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {0,2,4,6,8};

        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
    }

}
