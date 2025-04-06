package Shashank.WebAutomation.Interview_Preparation.ex_2025_04_April.ex_06042025;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringTwoDistinct {
    public int lengthOfLongestSubstringTwoDistinct(String s) {

//         Step 1: Edge Case Handling
        if (s == null || s.isEmpty()) {
            return 0;   // Handles null or empty strings—good safety net.
        }

        // Step 2: Initialize Tracking Variables
        int maxLength = 0;  //  holds the result.
        int left = 0;       // left pointer of the sliding window.
        Map<Character, Integer> charFrequency = new HashMap<>();    //  stores characters and their count within the current window.

        // Step 3: Slide the Right Pointer
        // Iterates over the string using a right pointer.
        //Adds the character at right to the map and updates its count.
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

            // Step 4: Shrink the Window If It Has >2 Distinct Characters
            // If more than 2 distinct characters exist, start sliding the left pointer.
            //Decrease the count of the character at left.
            //Remove it from the map if its count drops to zero (i.e., no longer in the window).
            //This loop shrinks the window until only 2 distinct characters are left.
            while (charFrequency.size() > 2) {
                char leftChar = s.charAt(left);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                left++;
            }

//            Step 5: Update Result
//            Calculates the window size and updates the maximum length seen so far.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstringTwoDistinct solution = new LengthOfLongestSubstringTwoDistinct();

        int output1 = solution.lengthOfLongestSubstringTwoDistinct("eceba");
        System.out.println("Output 1 : " + output1);

        int output2 = solution.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        System.out.println("Output 2 : " +output2);
    }
}
