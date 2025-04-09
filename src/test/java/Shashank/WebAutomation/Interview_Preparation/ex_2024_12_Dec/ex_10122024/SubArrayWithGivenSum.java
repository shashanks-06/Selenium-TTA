package Shashank.WebAutomation.Interview_Preparation.ex_2024_12_Dec.ex_10122024;

// Find SubArray with Given Sum, ExpectedSum = 33, Input array: int[] numbers = {1, 4, 20, 3, 10, 5};

import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static int[] findSubArrayWithSum(int[] array, int expectedSum){
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < array.length; end++) {
            currentSum += array[end];       // Add the current element to the running sum

            // Shrink the window from the start if the current sum exceeds the expected sum
            while (currentSum > expectedSum && start <= end){
                currentSum -= array[start];
                start++;
            }

            // Check if we have found the subArray with the exact sum
            if (currentSum == expectedSum){
                System.out.println("SubArray found in between " + start + " and " + end);
                // Return the SubArray
                return Arrays.copyOfRange(array, start, end + 1);       // The +1 is to include the element at end in the returned SubArray.
            }
        }

        // If no subArray is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int expectedSum = 33;

        int[] result = findSubArrayWithSum(numbers, expectedSum);

        if (result.length > 0){
            System.out.println("SubArray with Given Sum : -> " + Arrays.toString(result));
        }else {
            System.out.println("No SubArray with given sum was found.");
        }
    }
}
