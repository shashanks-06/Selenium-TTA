package Shashank.WebAutomation.Interview_Preparation.ex_0612204;

public class AccountNumValidator_1 {
    public static void main(String[] args) {

        int accountNumber = getAccountNumFromString("123-456-789");
        int numOfDigits = countNum(accountNumber);

        if (numOfDigits == 9){
            System.out.println("The 9 digits cleaned Account Number is " + accountNumber);
        }else {
            System.out.println("The Account Number is not of 9 Digits.\nIt is of " + numOfDigits + " digits");
            System.out.println("And That No. is " + accountNumber);
        }

    }

    public static int getAccountNumFromString(String accountNum){
        String modStr = accountNum.replaceAll("[^0-9]", "");

        return Integer.parseInt(modStr);
    }

    public static int countNum(int num){

        int counter = 0;
        int modNum = num;

        while (modNum != 0){
            modNum /= 10;

            counter++;
        }

        return counter == 0 ? 1 : counter;
    }
}
