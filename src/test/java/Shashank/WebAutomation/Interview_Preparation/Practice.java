package Shashank.WebAutomation.Interview_Preparation;

import java.util.*;


public class Practice {
    public static int[] removeDup(int[] array){
        int n = array.length;

        if (n == 0 || n == 1){
            return array;
        }

        int[] temp = new int[n];
        int index = 0;

        for (int k : array){
            boolean isDuplicate = false;

            for (int i = 0; i < index; i++) {

                if (k == temp[i]){
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate){
                temp[index++] = k;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4, 5};

        System.out.println(Arrays.toString(removeDup(array)));
    }


}
