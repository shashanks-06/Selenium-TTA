package Shashank.WebAutomation.Interview_Preparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Practice {

    public static int[] removeDup(int[] array) {
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
        int[] array = {1,1, 2,2, 3,3,4, 4,5,5};
        int[] result = removeDup(array);
        System.out.println(Arrays.toString(result));

    }

}
