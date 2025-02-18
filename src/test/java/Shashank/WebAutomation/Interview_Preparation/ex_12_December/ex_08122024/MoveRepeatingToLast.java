package Shashank.WebAutomation.Interview_Preparation.ex_0812204;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//      Find Repeating elements in array and move them to last without using temporary array

public class MoveRepeatingToLast {

    public static void rearrangeArray(int[] arr){
        HashSet<Integer> seenSet = new HashSet<>();
        int index = 0;  // Pointer for non-repeating elements

        int[] repeatingElements = new int[arr.length]; // Temporary array to store repeating elements
        int repeatingIndex = 0;

        // First pass: Move unique elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (!seenSet.contains(arr[i])){
                seenSet.add(arr[i]);
                arr[index++] = arr[i];  // Move unique element to the current index
            }else {
                repeatingElements[repeatingIndex++] = arr[i];   // Store repeating elements
            }
        }

        // Second pass: Add repeating elements to the end
        for (int i = 0; i < repeatingIndex; i++) {
            arr[index++] = repeatingElements[i];
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4, 5};

        rearrangeArray(array);

        System.out.println(Arrays.toString(array));
    }

}
