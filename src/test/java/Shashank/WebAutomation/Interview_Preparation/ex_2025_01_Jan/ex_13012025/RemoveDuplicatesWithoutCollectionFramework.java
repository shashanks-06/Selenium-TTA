package Shashank.WebAutomation.Interview_Preparation.ex_2025_01_Jan.ex_13012025;

import java.util.Arrays;

// Write Java code to remove duplicate elements from array without using CollectionFramework
public class RemoveDuplicatesWithoutCollectionFramework {

    public static int[] removeDuplicates(int[] arr){

        int n = arr.length;

        if (n == 0 || n == 1) {
            return arr;
        }

        int[] temp = new int[n];
        int index = 0;

        for (int k : arr) {

            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {

                if (k == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = k;
            }
        }

        int[] result =  new int[index];
        System.arraycopy(temp, 0, result, 0, index);
//        arraycopy(Object src,  int  srcPos, Object dest, int destPos,int length);

//        return temp;  [1, 2, 3, 4, 5, 6, 0, 0, 0]
        return result;  //[1, 2, 3, 4, 5, 6]
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4};
        int[] result = removeDuplicates(array);

        System.out.println(Arrays.toString(result));    // [1, 2, 3, 4, 5, 6]
    }

}
