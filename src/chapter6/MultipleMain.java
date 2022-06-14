package chapter6;

import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args) {
        user();
    }
    private static void user(){
        Multiple multiple = new Multiple();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        multiple.takeInNumbers(firstNumber, secondNumber);
        System.out.println(multiple.getIsMultiple());
    }
}
