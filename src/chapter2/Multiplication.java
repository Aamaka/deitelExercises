package chapter2;

import java.util.Scanner;

public class Multiplication{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("enter second number: ");
        int secondNumber = input.nextInt();

        int firstNumberTrippled = firstNumber * firstNumber * firstNumber;
        int secondNumberDoubled = secondNumber * secondNumber;

        int multiple = firstNumberTrippled * secondNumberDoubled;

        System.out.printf("the multiple of %d and %d is %d ", firstNumberTrippled, secondNumberDoubled, multiple);

  }
}

