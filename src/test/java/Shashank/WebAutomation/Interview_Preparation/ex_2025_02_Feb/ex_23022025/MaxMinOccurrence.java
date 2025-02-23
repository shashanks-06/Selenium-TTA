package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_23022025;

// 3. Get max and min occurrences of given String: Teeeessst Autoooooomationn output: u-1 and o-7

import java.util.HashMap;
import java.util.Map;

public class MaxMinOccurrence {
    public static void main(String[] args) {

        String str = "Teeeessst Autoooooomationn".replace(" ", "").toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0', minChar = '\0';
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            int count = entry.getValue();
            char character = entry.getKey();

            if (count > maxFreq){
                maxFreq = count;
                maxChar = character;
            }

            if (count < minFreq){
                minFreq = count;
                minChar = character;
            }
        }

        System.out.println(minChar + " : " + minFreq);
        System.out.println(maxChar + " : " + maxFreq);

    }
}
