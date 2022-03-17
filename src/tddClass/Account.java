package tddClass;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        balance = amount + balance;
    }

    public void withdrawal(int amount) {
        if(amount > balance){amount = 0;}
        balance = balance - amount ;

    }



    public int getBalance() {
        return balance;
    }


}


