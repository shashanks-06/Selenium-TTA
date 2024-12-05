package Shashank.WebAutomation.Interview_Preparation.ex_0512204;

import java.util.Scanner;

public class FactorialOfPosAndNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to do factorization: ");
        int n = sc.nextInt();

        if (factorial(n) == 0){
            System.out.println("The factorial of " + n + " is Zero(0).");
        }else if (factorial(n) < 0){
            System.out.println("The factorial for negative number is undefined. ");
        }else {
            System.out.println("Factorial of Positive number " + n + " :->  " + factorial(n));
        }
    }

    public static long factorial(int num){

        long result = 1;

        for (int i = 1; i <= num ; i++) {
            result *= i;
        }

        return result;
    }
}
