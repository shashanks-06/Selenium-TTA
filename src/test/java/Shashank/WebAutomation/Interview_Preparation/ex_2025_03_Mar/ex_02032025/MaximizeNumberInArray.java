package Shashank.WebAutomation.Interview_Preparation.ex_2025_03_Mar.ex_02032025;

import java.util.Arrays;

public class MaximizeNumberInArray {

    public static void maximizeNumber(int[] array){
        int n = array.length;

        for (int i = n - 1; i >= 0 ; i--) {
            if (array[i] != 9){
             array[i]++;
                for (int j = i + 1; j < n ; j++) {
                    array[j] = 0;
                }
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 9};
        maximizeNumber(array);
        maximizeNumber(array);

        System.out.println(Arrays.toString(array));
    }

}
