package chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditLimitMain {

    public static void main(String[] args) {
        collectInput();
    }


    public static void printOut() {
        System.out.println("Enter your account number: ");
    }


    public static void collectInput() {

        Scanner input = new Scanner(System.in);
        printOut();
        try {
            int accountNumber = input.nextInt();
            int accountNumber1 = input.nextInt();
            int accountNumber2 = input.nextInt();
            System.out.println("The maximum number is = "+Math.max(accountNumber, Math.max(accountNumber1, accountNumber2)));
        }catch (InputMismatchException in){
            System.out.println("Wrong input");
            collectInput();
        }

    }
}