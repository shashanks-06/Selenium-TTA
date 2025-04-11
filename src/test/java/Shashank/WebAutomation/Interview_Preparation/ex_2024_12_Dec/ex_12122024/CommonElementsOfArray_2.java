package Shashank.WebAutomation.Interview_Preparation.ex_2024_12_Dec.ex_12122024;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsOfArray_2 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);


        List<Integer> commonElements = new ArrayList<>(list1);  // initialized with list1.
        commonElements.retainAll(list2);        // Retains only the common elements


        System.out.println(commonElements);
    }
}
