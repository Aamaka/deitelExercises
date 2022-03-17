package chapter2;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("enter third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber == thirdNumber) {
            System.out.println("this is a palindrome");
        }
        if (firstNumber != thirdNumber){
            System.out.println("this is not a palindrome");
        }
    }
}