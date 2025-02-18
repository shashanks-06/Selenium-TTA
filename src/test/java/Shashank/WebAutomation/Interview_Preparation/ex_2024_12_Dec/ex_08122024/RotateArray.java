package Shashank.WebAutomation.Interview_Preparation.ex_0812204;

import java.util.Arrays;

//      Rotate a array without using temporary array, Input can be integer or character

public class RotateArray {

//    For Integer Arrays

    public static void reverse(int[] array, int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

//      Rotating Right
    public static int[] rightRotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n; // Handle cases where k > n

        reverse(array, 0 , n-1);    // reverse the entire array

        reverse(array, 0, k-1);     // reverse the array from 0th index to k-1

        reverse(array, k , n-1);        // reverse the array from kth index to n-1

        return array;
    }

//    Rotating Left
    public static int[] leftRotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n; // Handle cases where k > n

        reverse(array, 0 , k-1);    // reverse the array from 0th index to k-1

        reverse(array, k, n-1);     // reverse the array from kth index to n-1

        reverse(array, 0, n-1);        // reverse the entire array

        return array;
    }

//    ----------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        int k = 3;

//        ROTATING INTEGER ARRAY
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] rightRotatedIntArray = rightRotateArray(array, k);
        System.out.println("Right Rotated Array : " + Arrays.toString(rightRotatedIntArray));

//        int[] leftRotatedIntArray = leftRotateArray(array, k);
//        System.out.println("Left Rotated Array : " + Arrays.toString(leftRotatedIntArray));

//        ----------------------------------------------------------------

//        ROTATING CHARACTER ARRAY

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

//        char[] rightRotatedCharArray = rightRotateArray(charArray, k);
//        System.out.println("Right Rotated CharArray : " + Arrays.toString(rightRotatedCharArray));

        char[] leftRotatedCharArray = leftRotateArray(charArray, k);
        System.out.println("Right Rotated CharArray : " + Arrays.toString(leftRotatedCharArray));

    }

//  ----------------------------------------------------------------------------------------------------------

//          ROTATING CHARACTER ARRAY

    public static void reverse(char[] array, int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = (char) temp;

            start++;
            end--;
        }
    }

//    Rotating Right
    public static char[] rightRotateArray(char[] array, int k){
        int n = array.length;

        k = k % n; // Handle cases where k > n

        reverse(array, 0 , n-1);    // reverse the entire array

        reverse(array, 0, k-1);     // reverse the array from 0th index to k-1

        reverse(array, k , n-1);        // reverse the array from kth index to n-1

        return array;
    }

//    Rotating Left
    public static char[] leftRotateArray(char[] array, int k){
        int n = array.length;
        k = k % n; // Handle cases where k > n

        reverse(array, 0 , k-1);    // reverse the array from 0th index to k-1

        reverse(array, k, n-1);     // reverse the array from kth index to n-1

        reverse(array, 0, n-1);        // reverse the entire array

        return array;
    }

}
