package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_17022025;

import java.util.Arrays;

public class FindKthElement {

    public static int kthSmallestElement(int[] array, int k){
        Arrays.sort(array);
        return array[k - 1];
    }

    public static int kthBiggestElement(int[] array, int k){
        Arrays.sort(array);
        return array[array.length - k];
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 7, 1, 3, 6};
        System.out.println("3rd Smallest Element: " + kthSmallestElement(array, 3)); // 3
        System.out.println("3rd Biggest Element: " + kthBiggestElement(array, 3));  // 5
    }

}
