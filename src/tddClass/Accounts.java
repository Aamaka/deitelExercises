package tddClass;

public class Accounts {
    String name = "";
    String accountNumber = "";
    static int balance = 0;
    static int rate;
    public static int interestRate;
    public Accounts(String name , String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

public static void setInterestRate(int rate){
        interestRate = rate;
}
public int addInterestRate(){
        balance += balance * interestRate/100;
        // balance = this.balance  + interestRate;
        return balance;
}

    public void deposit(int amount) {
        this.balance = amount;
    }

    public void withdrawal(int amount) {
        if(amount < balance)
        this.balance -= amount;
        if(amount > balance)
            System.out.println("insufficient balance");
        else System.out.println("transaction successful");
    }

    public void transfer(Accounts name,int amount) {
        this.balance -= amount;
        name.balance =+amount;
    }
}
