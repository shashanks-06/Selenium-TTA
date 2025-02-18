package Shashank.WebAutomation.Interview_Preparation.ex_0912204;

import java.util.Arrays;

//  Move all the negative numbers present in integer array to start.

public class NegativeToStart {

    public static void moveNegativeToStart(int[] array){

        int left = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i] < 0){
                int temp = array[i];
                array[i] = array[left];

//                array[left] = temp;
//                left++;

//                OR
                array[left++] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 0, -9, -2, 3, -7, 8, -5};
        moveNegativeToStart(array);
        System.out.println("Negative Element Sorted Array : " + Arrays.toString(array));
    }
}
