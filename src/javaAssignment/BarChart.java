package javaAssignment;

import java.util.Scanner;

public class BarChart {
    public static void main(String...args){
        Scanner chart = new Scanner(System.in);
        System.out.println("enter number1: ");
        int number1 = chart.nextInt();
        System.out.println("enter number2: ");
        int number2 = chart.nextInt();
        System.out.println("enter number3: ");
        int number3 = chart.nextInt();
        System.out.println("enter number4: ");
        int number4 = chart.nextInt();
        System.out.println("enter number5: ");
        int number5 = chart.nextInt();

        for(int count = 0; count < number1 ;count++ ) {
            if (number1 <= 30)
            {
                System.out.print("*");
            }else{
                System.out.println(" ");
            }
        }
        System.out.println();

        for(int i = 0; i < number2 ;i++ ) {
            if (number2 <= 30)
            {
                System.out.print("*");
            }else{
                System.out.println(" ");
            }
        }

        System.out.println();
        for(int i = 0; i < number3 ;i++ ) {
            if (number3 <= 30)
            {
                System.out.print("*");
            }else{
                System.out.println(" ");
            }
        }

        System.out.println();

        for(int i = 0; i < number4 ;i++ ) {
            if (number4 <= 30)
            {
                System.out.print("*");
            }else{
                System.out.println(" ");
            }
        }

        System.out.println();

        for(int count = 0; count < number5;count ++){
            if (count <= 30){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }


    }
}
