package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_23022025;

//2. Reverse words of given string:
// I/p: Test Automation and o/p: Automation Test

public class ReverseWords_3 {

    public static void reverseWords(String str){
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0 ; i--) {
            System.out.print(words[i] + (i > 0 ? " " : ""));
        }
    }

    public static void main(String[] args) {
        String words = "Test Automation";
        reverseWords(words);
    }
}
