package Shashank.WebAutomation.Interview_Preparation.ex_2025_02_Feb.ex_19022025;

public class StringPermutation {
    public static void permute(String str, String result){

        if (str.isEmpty()){
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }
}
