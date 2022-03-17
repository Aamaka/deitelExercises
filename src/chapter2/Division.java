package chapter2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
       Scanner amaka = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number =amaka.nextInt();

        int division = number % 3;

        if (division == 0) {
            System.out.println("number is divisible by 3");

        }
        if (division != 0){
            System.out.println("number is not divisible by 3");
        }

    }
}
