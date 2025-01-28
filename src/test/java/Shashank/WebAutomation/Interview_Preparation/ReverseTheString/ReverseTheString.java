package Shashank.WebAutomation.Interview_Preparation.ReverseTheString;

public class ReverseTheString {

    public static String reverseWithWhile(String string){
        String rev = "";
        int i = string.length() - 1;

        while (i >= 0){
            rev += string.charAt(i);

            i--;
        }
        return rev;
    }

    public static String reverseWithFor(String string){
        String rev = "";

        for (int i = string.length() - 1; i >= 0 ; i--) {
            rev += string.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);
//        System.out.println(reverseWithWhile(string));
        System.out.println(reverseWithFor(string));

    }
}
