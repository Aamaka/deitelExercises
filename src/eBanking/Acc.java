package eBanking;

public class Acc {
    private int balance;

    private  final String ACCOUNT_NUMBER;
    private  String accountName;
    private  final String PIN;

    public  Acc(String accountNumber,String firstName, String lastName, String pin){
        ACCOUNT_NUMBER = accountNumber;
        this.accountName = firstName +" " + lastName;
        PIN = pin;
    }

    public int getBalance(String pin) {
        if(pin.equals(PIN)){
        return balance;}
        else {
        System.out.println("wrong pin");
        return 0;}

    }

    public void deposit(int amount) {balance += amount;
    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void withdraw(int amount,String pin) {
        if(pin.equals(PIN)) balance -= amount;

    }
}
