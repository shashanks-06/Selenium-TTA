package Shashank.WebAutomation.Interview_Preparation;

public class Practice {

  public static String validateAccountNum(String accountNum){
      String modString = accountNum.replaceAll("[^0-9]", "");

      if (modString.length() == 9){
          return modString;
      }else {
          return "Not a valid account number with 9 digits.";
      }
  }

    public static void main(String[] args) {
      String accountNum = "123@!*&-%^-456(#^-7^*&*89";
        System.out.println(validateAccountNum(accountNum));
    }




}
