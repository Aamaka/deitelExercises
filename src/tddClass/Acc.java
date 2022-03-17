package tddClass;

public class Acc {
    private int balance;

    public void deposit(int amount) {
        if(amount > 0)
        balance = balance + amount;
    }
    public void withdraw(int amount) {
   if ( balance > amount)
        balance= balance - amount;
    }

    public int getBalance() {
        return balance;
    }


}

