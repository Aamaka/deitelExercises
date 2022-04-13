package personalFun;

import eBanking.Acc;
import eBanking.Bank;

import java.util.Scanner;

public class AccountMain {
    private static Scanner scanner = new Scanner(System.in);
   private  static  Bank bank = new Bank("Zubank",4);
    public static void main(String[] args) {
        runApp();



    }

    private static void runApp() {
        String prompt = """
                Welcome to ZuBAnk,
                press softly
                1 -> To create account
                2 -> To deposit
                3 -> To Withdraw
                4 -> To transfer
                5 -> To check balance
                6 -> To exit
                """;
        System.out.println(prompt);
        String userInput = scanner.next();
        switch (userInput) {
            case "1" -> createAccount();
             case "2" -> deposit();
             case "3" -> withDraw();
//            case 4 -> transfer();
//            case 5 -> checkBalance();
//            case 6 -> exit();
            default -> runApp();
        }

    }

    private static void createAccount() {
        System.out.println("enter first name: ");
        String firstName = scanner.nextLine();
        scanner.next();
        System.out.println("enter last name");
        String lastName = scanner.nextLine();
        scanner.next();
        System.out.println("enter pin: ");
        String pin = scanner.nextLine();
        scanner.next();
        Acc savedAcc = bank.register(firstName,lastName,pin);
        System.out.println(savedAcc);
        runApp();

    }
    public static void deposit(){
        System.out.println("which account: ");
        String accountNumber = scanner.nextLine();
        scanner.next();
        Acc acc = bank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("the account name is"+acc.getAccountName());
        System.out.println("how much");
        int amount = scanner.nextInt();
        scanner.next();
        bank.deposit(amount,accountNumber);

        System.out.println();
        System.out.println(acc);
        System.out.println();
        runApp();
    }

    private static void withDraw(){
        System.out.println("which account");
        String accountNumber = scanner.nextLine();
        System.out.println("pin: ");
        String pin = scanner.next();
        System.out.println("how much: ");
        int amount = scanner.nextInt();
        bank.withdraw(amount,accountNumber,pin);

        System.out.println("successful!!!");
        Acc acc = bank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("your new balance is "+acc.getBalance(pin));
        System.out.println();
        scanner.next();
        runApp();
    }

}