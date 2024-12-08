package Shashank.WebAutomation.Interview_Preparation.ex_0812204;

import java.util.Arrays;
import java.util.HashSet;

//      Find Repeating elements in array and move them to last without using temporary array

public class MoveRepeatingToLast {

    public static void rearrangeArray(int[] arr){
        HashSet<Integer> seenSet = new HashSet<>();
        int index = 0;  // Pointer for non-repeating elements

        for (int i = 0; i < arr.length; i++) {
            if (!seenSet.contains(arr[i])){
                seenSet.add(arr[i]);
                arr[index++] = arr[i];  // Move unique element to the current index
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (seenSet.contains(arr[i])){
                seenSet.remove(arr[i]);     // Only add repeating elements once

                if (index < arr.length){
                    arr[index++] = arr[i];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4};
        rearrangeArray(array);

        System.out.println(Arrays.toString(array));
    }

}
