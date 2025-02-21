package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_21022025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();

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
        int[] array = {1, 2, 2, 3, 4, 5, 5, 6};

        int[] result = removeDuplicates(array);

        System.out.println(Arrays.toString(result));
    }
}
