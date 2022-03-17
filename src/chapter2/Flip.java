package chapter2;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = input.nextInt();

        if (number == 0){
            System.out.println("1");
        }

        if (number != 0){
            System.out.println("0");

        }


    }
}
