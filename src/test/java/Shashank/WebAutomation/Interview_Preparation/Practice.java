package Shashank.WebAutomation.Interview_Preparation;

import java.util.*;


public class Practice {

    public static int[] findSubArray(int[] array, int expectedSum) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < array.length; end++) {

            currentSum += array[end];

            while(currentSum > expectedSum && start <= end){
                currentSum -= array[start];
                start++;
            }

            if (currentSum == expectedSum){
                System.out.println("SubArray found in between : " + start + " and " + end);
                return Arrays.copyOfRange(array, start, end + 1);
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int expectedSum = 33;

        System.out.println(Arrays.toString(findSubArray(numbers, expectedSum)));
    }

}
