package javaAssignmentTest;

import java.util.Scanner;

public class CardNumber {
    public static void main(String[] args) {
        cards();
    }
    public  static void cards(){
        int sum = 0;
        int total = 0;
        int mut ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 13 numbers: ");
        int number = input.nextInt();
        int [] arr = new int[number];
        System.out.println("enter number");
        for (int i = 0; i < number; i ++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < number; i+=2) {
            System.out.println(arr[i] * 2);
            mut = arr[i] * 2;
            if (mut > 9){
                int i1 = mut * 10 % 10;
                int i2 = mut % 10;
                sum = i1 + i2;
            }
            total = arr[i] + sum;
        }
        System.out.println(total);
    }
}
