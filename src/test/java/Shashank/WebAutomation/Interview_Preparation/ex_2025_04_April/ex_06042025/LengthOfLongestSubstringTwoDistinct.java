package Shashank.WebAutomation.Interview_Preparation.ex_2025_04_April.ex_06042025;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringTwoDistinct {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

            while (charFrequency.size() > 2) {
                char leftChar = s.charAt(left);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                left++;
            }

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
