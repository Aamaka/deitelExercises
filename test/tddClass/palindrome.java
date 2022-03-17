package tddClass;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("enter  first number: ");
        int firstNumber = input.nextInt();

        System.out.println("enter  second number: ");
        int secondNumber = input.nextInt();

        System.out.println("enter  third number: ");
        int number = input.nextInt();

        System.out.println("enter  fourth number: ");
        int fourthNumber = input.nextInt();

        System.out.println("enter fifth number: ");
        int fifthNumber = input.nextInt();

        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println("it is a palindrome");


        }

    }
}
