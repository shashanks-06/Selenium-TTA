package Shashank.WebAutomation.Interview_Preparation.ex_2025_03_Mar.ex_01032025;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        while (original != 0){
            int lastDigit = original % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            original = original/10;
        }
        System.out.println("Original Number : " + num + " | Calculated Value : " + sum);
        System.out.print("That's why it is -> ");
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
