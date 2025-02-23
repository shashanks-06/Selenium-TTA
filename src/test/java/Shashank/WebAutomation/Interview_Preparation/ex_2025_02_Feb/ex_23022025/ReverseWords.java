package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_23022025;


//2. Reverse words at same place of given string:
//I/p: Test Automation and o/p: tseT noitamotuA

public class ReverseWords {

    public static String reverseWordsInPlace(String str){
        if (str == null || str.isEmpty()){
            return str;
        }

        String[] words = str.split(" ");    // Split string into words

        StringBuilder result = new StringBuilder();

        for (String word : words){
            result.append(new StringBuilder(word).reverse()).append(" ");   // Reverse each word
        }

        return result.toString().trim();    // Remove trailing space
    }

    public static void main(String[] args) {
        String input = "Test Automation";
        String output = reverseWordsInPlace(input);
        System.out.println(output);  // Output: tseT noitamotuA
    }
}
