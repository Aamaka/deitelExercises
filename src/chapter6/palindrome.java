package chapter6;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit numbers: ");
        int numbers = scanner.nextInt();

        int firstNumber = numbers / 10_000;
        int secondNumber = (numbers / 1000) % 10;
        int thirdNumber = (numbers / 100) % 10;
        int fourthNumber = (numbers / 10) % 10;
        int fifthNumber = numbers % 10;

        if(firstNumber == fifthNumber && secondNumber == fourthNumber){
            System.out.println("it's a palindrome");
        }
        else System.out.println("it's not a palindrome");

    }
}
