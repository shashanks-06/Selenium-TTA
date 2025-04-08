package Shashank.WebAutomation.Interview_Preparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void rearrangeArray(int [] array){
        Set<Integer> set = new HashSet<>();
        int index = 0;

        int[] repeatedElements = new int[array.length];
        int repeatingIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])){
                set.add(array[i]);
                array[index++] = array[i];
            }else {
                repeatedElements[repeatingIndex++] = array[i];
            }
        }

        for (int i = 0; i < repeatingIndex; i++) {
            array[index++] = repeatedElements[i];
        }
    }



    public static void main(String[] args) {
        int[] array = {1, 1, 2,2, 3,3, 4,4, 5,5};
        rearrangeArray(array);
        System.out.println("Rearranged Array: " + Arrays.toString(array));
    }

}
