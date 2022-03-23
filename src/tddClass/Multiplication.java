package tddClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = input.nextInt();

        for(int i = 1; i <= 12; i++){
        int division = number % i;
            // int multiple = i * number;

            System.out.printf( "%d // %d = %d\n",number,i,division );

        }

    }
}
