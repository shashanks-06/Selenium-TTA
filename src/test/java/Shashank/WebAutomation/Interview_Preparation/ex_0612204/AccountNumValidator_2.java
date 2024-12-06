package Shashank.WebAutomation.Interview_Preparation.ex_0612204;

public class AccountNumValidator_2 {
    public static void main(String[] args) {

        System.out.println(getCleanedNum("123-456-789"));
    }

    public static String getCleanedNum(String accountNum){
        String cleanedNum = accountNum.replaceAll("[^0-9]", "");

        if (cleanedNum.length() == 9){
            return cleanedNum;
        }else {
            return "Error : The Number must be exactly of 9 digits.";
        }
    }

}
