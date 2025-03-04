package Shashank.WebAutomation.Interview_Preparation.ex_2025_03_Mar.ex_02032025;

import java.util.Arrays;

//  1. create a Java program that increases a number in an array to achieve the largest possible number,
//  follow these steps: Identify the rightmost number that can be incremented without causing a carry overflow.
//  Increment this number and set all subsequent digits to zero.
// Input: {1,2,9}
// Output:{1,3,0}


public class MaximizeNumberInArray {

    public static void maximizeNumber(int[] array){
        int n = array.length;

        // Identify the rightmost digit that can be incremented (not a 9)
        for (int i = n - 1; i >= 0 ; i--) {

            if (array[i] != 9){
             array[i]++;    // Increment the rightmost non-9 digit

                // Set all subsequent digits to 0
                for (int j = i + 1; j < n ; j++) {
                    array[j] = 0;
                }
                return;     // ensures that the function performs its 'single', specific task
                            // (finding and applying the next largest number change) and then stops.
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 9};
        maximizeNumber(array);  // [1, 3, 0]
        maximizeNumber(array);  // [1, 3, 1]

        System.out.println(Arrays.toString(array));
    }

}
