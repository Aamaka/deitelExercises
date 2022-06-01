package eBanking;

import java.util.Scanner;

public class ATM {

    static Bank bank = new Bank("UBA",20);
    static  int userInput;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        login();
    }

    private static void login(){
        System.out.println("card inserted");
        System.out.println("enter your pin: ");
        userInput = input.nextInt();
    }


    private static void menu(){
        System.out.println("""
                1.
                """);
    }
}
