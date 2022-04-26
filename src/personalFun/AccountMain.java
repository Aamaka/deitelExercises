package personalFun;

import eBanking.Acc;
import eBanking.Bank;

import java.util.Scanner;

public class AccountMain {
   private  static  Bank bank = new Bank("firstBank",4);
    public static void main(String[] args) {
        runApp();



    }

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
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
              case "4" -> transfer();
             case "5" -> checkBalance();
            case "6" -> exit();
            default -> runApp();
        }

    }



    private static void createAccount() {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("enter first name: ");
        String firstName = newScanner.nextLine();
        System.out.println(firstName);

        System.out.println("enter last name");
        String lastName = newScanner.nextLine();
        System.out.println(lastName);

        System.out.println("enter pin: ");
        String pin = newScanner.nextLine();

        Acc savedAcc = bank.register(firstName,lastName,pin);
        System.out.println(savedAcc);
        runApp();

    }
    public static void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which account: ");
        String accountNumber = scanner.nextLine();
        Acc acc = bank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("the account name is "+acc.getAccountName());
        System.out.println("how much");
        int amount = scanner.nextInt();
        bank.deposit(amount,accountNumber);

        System.out.println();
        System.out.println(acc);
        System.out.println();
        runApp();
    }

    private static void withDraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which account");
        String accountNumber = scanner.nextLine();
        System.out.println("pin: ");
        String pin = scanner.next();
        System.out.println("how much: ");
        int amount = scanner.nextInt();
        bank.withdraw(amount,accountNumber,pin);

        Acc acc = bank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("successful!!!");
        System.out.println("your new balance is "+acc.getBalance(pin));
        System.out.println();
        runApp();
    }

    public static void transfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your account number");
        String senderAccountNumber = scanner.nextLine();
        System.out.println("enter receiver account number");
        String receiverAccountNumber = scanner.nextLine();
        System.out.println("pin: ");
        String pin = scanner.next();
        System.out.println("how much: ");
        int amount = scanner.nextInt();
        bank.transfer(amount,senderAccountNumber,receiverAccountNumber,"pin");

        Acc acc = bank.findAccount(Integer.parseInt(senderAccountNumber));
        System.out.println();
        System.out.println("successful!!!");
        System.out.println("your new balance is "+acc.getBalance(pin));
        System.out.println();
        runApp();

    }

    private static void checkBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("enter your pin: ");
        String pin = scanner.nextLine();
        Acc acc = bank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("your balance is "+ acc.getBalance(pin));

        System.out.println();
        runApp();
    }

    private  static  void exit(){
        System.out.println("Thank you for banking with us");
        System.exit(0);
    }
}