package Shashank.WebAutomation.Interview_Preparation;

import java.util.Arrays;


public class Practice {

    public static void negativeToStart(int[] array) {
        int left = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                int temp = array[i];
                array[i] = array[left];
                array[left++] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, -5};
        negativeToStart(array);

        System.out.println(Arrays.toString(array));

    }

}
