package Shashank.WebAutomation.Interview_Preparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void reverse(int[] array, int start, int end) {
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftShiftArray(int[] array, int k) {
        int n = array.length;

        reverse(array, 0, k - 1);
        reverse(array, k, n-1);
        reverse(array, 0, n-1);
    }

    public static void rightShiftArray(int[] array, int k){
        int n = array.length;

        reverse(array, 0, n-1);
        reverse(array, 0, k-1);
        reverse(array, k, n-1);
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//        leftShiftArray(array, 3);
        rightShiftArray(array, 3);
        System.out.println(Arrays.toString(array));

    }

}
