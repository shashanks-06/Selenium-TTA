package Shashank.WebAutomation.Interview_Preparation.ex_1212204;

import java.util.ArrayList;
import java.util.List;

//      Write a program to find the common elements between two ArrayLists.

public class CommonElementsOfArray_1 {

    public static List<Integer> findCommonElements(List<Integer> arr1, List<Integer> arr2){

        List<Integer> commonElements = new ArrayList<>();
        int index = 0;

        for (Integer value : arr1) {

            for (Integer integer : arr2) {

                if (value.equals(integer)) {
                    commonElements.add(index++, value);
                }

            }

        }

        return commonElements;

    }

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        int arr1Value = 1;
        for (int i = 0; i < 10; i++) {
            arr1.add(i, arr1Value);
            arr1Value++;
        }
        System.out.println(arr1);

        List<Integer> arr2 = new ArrayList<>();
        int arr2Value = 6;
        for (int i = 0; i < 5; i++) {
            arr2.add(i, arr2Value);
            arr2Value++;
        }
        System.out.println(arr2);


        List<Integer> commonElementsArray = findCommonElements(arr1, arr2);

        System.out.println(commonElementsArray);

    }

}
