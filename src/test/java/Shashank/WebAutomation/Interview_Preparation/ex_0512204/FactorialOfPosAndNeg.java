package Shashank.WebAutomation.Interview_Preparation.ex_0512204;

import java.util.Scanner;

public class FactorialOfPosAndNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to do factorization: ");
        int n = sc.nextInt();

        if (n == 0){
            System.out.println("The factorial of " + n + " is One(1).");
        }else if (n < 0){
            System.out.println("The factorial for Negative Number (" + n + ") is undefined. ");
        }else {
            System.out.println("Factorial of Positive Number (" + n + ") :->  " + factorial(n));
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
