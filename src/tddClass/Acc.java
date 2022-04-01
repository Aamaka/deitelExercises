package tddClass;

public class Acc {
     int balance ;
    int amount;
    public void deposit(int amount) {
        if(amount > 0)
        balance = balance + amount;
    }
    public void withdraw(int amount) {
   if ( balance > amount)
        balance= balance - amount;
    }

    public int getBalance() {
        return balance +amount;
    }



    public void transfer(Acc name, int amount) {
        balance = balance - amount;
        name.balance+=amount;


    }

    public int getBalanceB() {
        return balance + amount;
    }
}

