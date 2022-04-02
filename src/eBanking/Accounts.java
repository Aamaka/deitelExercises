package eBanking;

public class Accounts {

    private int balance;

    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (balance == 0 || balance < 0) {
            System.out.println("you amount is 0" + balance);
        } else if (amount > balance) {
            System.out.println(balance);
            System.out.println("you cant exceed your balance");
        } else
            this.balance = balance - amount;
        System.out.println(balance);
    }

    public int getBalance() {
        return balance;
    }
}

