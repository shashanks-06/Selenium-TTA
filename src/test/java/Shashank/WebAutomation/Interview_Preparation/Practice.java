package Shashank.WebAutomation.Interview_Preparation;

import java.util.*;


public class Practice {

    public static void countOccurrences(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void countOccurrences(String string) {
        char[] charArray = string.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : charArray){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        int[] array = {1,1,3, 2,2, 3,3,4, 4,5,5, 5};
//       countOccurrences(array);

        String string = "aabbczcddeeffggh";
        countOccurrences(string);
    }

}
