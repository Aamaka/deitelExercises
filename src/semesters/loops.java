package semesters;

import java.util.Scanner;

public class loops {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        twenty();
        downward();
        even();
        user();
        users();
        prints();
        printArrow();
        angle();
        multi();
        whileTIme();
        int x = 10;
       demoMethod(x);
    }
    public static void twenty(){
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void downward(){
        for (int i = 20; i > -1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static  void even(){
        for (int i = 0; i < 21; i++) {
            if(i % 2 ==  0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void user(){

        prompt();
        int number = in.nextInt();
        for (int i = 0; i <= number; i++) {
            if(i % 2 ==  0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void users(){
        prompt();
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i % 2 ==  0){
                System.out.println(i + " it is even");
            }
            else {
                System.out.println(i + " it is odd");
            }

        }
    }

    public static  void prints(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public  static void printArrow(){
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 2 || i == 3){
                    j = 9;
                    System.out.print("*  *  *  *  *  *  *  *  *  ");
                }
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void angle(){
        for (int i = 0; i < 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void multi(){
        prompt();
        int num = in.nextInt();
        int mut ;
        for (int i = 1; i < 13; i++) {
            mut = i * num;
            System.out.printf("%d  X  %d  = %d", i, num, mut);

            System.out.println();
        }
    }
    public static void whileTIme(){
        prompt();
        int num = in.nextInt();
        int mut;
        int i = 1;
        while (i < 13){
            if(num < 3){
                System.out.println("number should be greater than 2");
                break;
            }
            mut = i * num;
            System.out.printf("%d  X  %d  = %d", i, num, mut);
            System.out.println();
            i ++;
        }
    }

    static void demoMethod(int xIn)
    {
        xIn = 25;
        System.out.println(xIn);
    }

    public static  void prompt(){
        System.out.println("enter a number: ");
    }

}





