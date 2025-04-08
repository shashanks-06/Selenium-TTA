package Shashank.WebAutomation.Interview_Preparation.ex_2024_12_Dec.ex_09122024;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//  Remove all the duplicate elements from integer array

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int[] array){
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : array){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set){
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 6, 2, 8, 3, 4, 4,5, 1, 6, 7, 3, 8};
        int[] newArray = removeDuplicates(array);

        System.out.println("Array without Duplicates: " + Arrays.toString(newArray));
    }
}
