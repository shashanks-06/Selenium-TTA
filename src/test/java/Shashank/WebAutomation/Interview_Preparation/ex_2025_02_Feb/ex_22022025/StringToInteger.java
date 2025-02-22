package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_22022025;

public class StringToInteger {

    public static int convertToInteger(String str){

        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException("Input String is null or is empty.");
        }

        int num = 0;
        int sign = 1;
        int i = 0;

        // Handle negative numbers
        if (str.charAt(0) == '-'){
            sign = -1;
            i++;
        }

        for(; i < str.length(); i++){
            char ch = str.charAt(i);

            // Check if character is a digit
            if (ch < '0' || ch > '9'){
                throw new NumberFormatException("Invalid Character Input: " + ch);
            }

            num = num * 10 + (ch - '0');    // Convert character to integer
//            '5' - '0' => 53 - 48 = 5(integer)
//            ASCII value of char '5' = 53
//            ASCII value of char '0' = 48
        }
        return num * sign;
    }

    public static void main(String[] args) {
        System.out.println(convertToInteger("12345"));
        System.out.println(convertToInteger("-67890"));
    }
}
