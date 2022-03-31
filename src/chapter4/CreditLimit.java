package chapter4;

public class CreditLimit {

    private int accountNumber;
    private int balance;
    private int totalItemCharged;
    private int creditApplied;
    private int creditLimit;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setTotalItemCharged(int totalItemCharged) {
       this.totalItemCharged = totalItemCharged;
    }

    public int getTotalItemCharged() {
        return totalItemCharged;
    }

    public void setCreditApplied(int creditApplied) {
        this.creditApplied = creditApplied;
    }

    public int getCreditApplied(){
        return creditApplied;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

    public int getNewBalance() {
       return  balance + totalItemCharged - creditApplied;
    }


    public void checkExceedLimit() {
        if (getNewBalance() > creditLimit)
            System.out.println("credit limit exceeded");
    }
}
