package Shashank.WebAutomation.Interview_Preparation.ex_1012204;


import java.util.Arrays;

//  Rotate an array by K number of steps, k = 3, Input Array: int[] arr2 = {2, 4, 6, 8, 10, 12, 14};
public class RotateWithSteps {

    public static void reverse(int[] array, int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }


    public static void stepRightRotateArray(int[] array, int steps){
        int n = array.length;

        reverse(array, 0, n-1);     // reverse whole array

        reverse(array, 0, steps - 1);       // reverse up to steps-1

        reverse(array, steps, n-1);     //  reverse from steps to n-1
    }

    public static void stepLeftRotateArray(int[] array, int steps){
        int n = array.length;

        reverse(array,0, steps-1);      // reverse up to steps-1

        reverse(array, steps, n-1);     //  reverse from steps to n-1

        reverse(array, 0, n-1);     // reverse whole array
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};

        stepRightRotateArray(array, 3);       // [10, 12, 14, 2, 4, 6, 8]
//        stepLeftRotateArray(array, 3);      // [8, 10, 12, 14, 2, 4, 6]

        System.out.println(Arrays.toString(array));
    }

}
