package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_23022025;

import java.util.Arrays;

public class ReverseWords_2 {

    public static void reverseWords(String str){

        if (str == null || str.isEmpty()){
            System.out.println(str);
        }

        assert str != null;
        String[] words = str.split(" ");


        for (String word : words) {
            char[] charArray = word.toCharArray();
            int left = 0, right = charArray.length - 1;

            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
            System.out.print(new String(charArray) + " ");
        }

    }

    public static void main(String[] args) {
        String input = "Test Automation";
        reverseWords(input);    // Output: tseT noitamotuA
    }
}
