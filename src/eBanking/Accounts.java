package eBanking;

public class Accounts {

    private int balance;

    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount > balance){amount = 0;}
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

