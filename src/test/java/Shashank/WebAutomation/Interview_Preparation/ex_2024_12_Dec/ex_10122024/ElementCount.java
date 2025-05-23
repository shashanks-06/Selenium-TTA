package Shashank.WebAutomation.Interview_Preparation.ex_2024_12_Dec.ex_10122024;

//  Count Occurrences of Each Element in an Array, Input Array: int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};
//  Count Occurrences of Each character in a String

import java.util.HashMap;
import java.util.Map;

public class ElementCount {

    public static void countOccurrences(int[] numbers){
        // Create a HashMap to store the occurrences
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        // Traverse the array
        for (int num : numbers){
            // Increment the count for each element in the map
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        // Print the occurrences
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()){
            System.out.println("Element : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }

    public static void countOccurrences(String string){
        char[] charArray = string.toLowerCase().toCharArray();

        Map<Character, Integer> occurenceMap = new HashMap<>();

        for (char c : charArray){
            occurenceMap.put(c, occurenceMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : occurenceMap.entrySet()){
            System.out.println("Element : " + entry.getKey() + " Count : " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};
        countOccurrences(numbers);

        String name = "Shashank";
        countOccurrences(name);
    }
}


/*
  getOrDefault() Method:
    occurrenceMap.getOrDefault(num, 0) checks if the number (num) is already in the map.
    - If the number exists, it returns its current count.
    - If the number doesn’t exist, it returns 0 (default value).
    Update Count:
        Add 1 to the current count and store it back in the map using occurrenceMap.put(num, newCount).
*/
