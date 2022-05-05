package chapter5;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int [] numbers = new int[5] ;
        for (int counter = 1; counter < numbers.length ; counter++) {
            System.out.print("Enter a number: ");
            numbers[counter] = scanner.nextInt();
            sum += numbers[counter];
        }
        System.out.println(sum);
    }
}
