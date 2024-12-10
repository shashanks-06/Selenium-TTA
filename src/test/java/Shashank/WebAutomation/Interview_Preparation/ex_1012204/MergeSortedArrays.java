package Shashank.WebAutomation.Interview_Preparation.ex_1012204;


//  Merge the 2 sorted arrays, Inputs:
//  int[] arr1 = {1, 3, 5, 7}; int[] arr2 = {2, 4, 6, 8};

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n+m];
        int i = 0, j = 0, k = 0;

        // Traversing both arrays and pick the smaller element
        while (i < n && j < m){
            if (arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copying remaining elements of arr1
        while (i < n){
            mergedArray[k++] = arr1[i++];
        }

        // Copying remaining elements of arr2
        while ( j < m){
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {0, 2, 4, 6, 8};

        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Arrays : " + Arrays.toString(result));

    }

}
