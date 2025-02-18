package Shashank.WebAutomation.Interview_Preparation.ex_2025_01_Jan.ex_19012025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Write Java code to remove duplicates from an array ?

public class RemoveDuplicatesFromArray {

    public static void removeDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();
        int[] temp = new int[array.length];
        int duplicateIndex = 0;

        for (int num : array){
            if (!set.contains(num)){
                set.add(num);
            }else {
                temp[duplicateIndex++] = num;
            }
        }

        int[] result = new int[set.size()];
        int uniqueIndex = 0;
        for (int num : set){
            result[uniqueIndex++] = num;
        }

        int[] duplicates = Arrays.copyOfRange(temp, 0, duplicateIndex);

        System.out.println("Original Array -> " + Arrays.toString(array));
        System.out.println("Array with no Duplicates -> " + Arrays.toString(result));
        System.out.println("Array containing duplicates -> " + Arrays.toString(duplicates));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        removeDuplicates(arr);
    }
}
