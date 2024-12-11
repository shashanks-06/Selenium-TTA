package Shashank.WebAutomation.Interview_Preparation.ex_1112204;

import java.util.Arrays;

public class HighestIntOfArray {

    public static void sortDescending(int[] array){
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int getLargestInt(int[] array){
        sortDescending(array);
        return array[0];
    }

    public static int get2ndLargestInt(int[] array){
        sortDescending(array);
        return array[1];
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 9, 0, 5, 3, 8, 1, 7};

        sortDescending(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Highest Int : " + getLargestInt(array));
        System.out.println("2nd Largest Int : " + get2ndLargestInt(array));
    }

}
