package eBanking;

public class Banks {

    private final String myBankName;
    private final Acc[] acc;
    private int numberOfCustomers;


    public Banks(String bankName, int numberOfCustomers) {
        myBankName = bankName;
        acc = new Acc[numberOfCustomers];
    }

    public String getName() {
        return myBankName;
    }

    public int getMaximumNumberOfCustomers() {
        return acc.length;
    }

    public Acc createBankAccounts(String firstName, String secondName, String pin) {
        String accountNumber = String.valueOf((numberOfCustomers));
        Acc account = new Acc(accountNumber, firstName,secondName,pin);
        acc[numberOfCustomers] = account;
        numberOfCustomers++;
        return account;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Acc findAccount(int accountNumber) {
        int indexOfAccount = accountNumber -1;
        return acc[indexOfAccount];
        //return acc[accountNumber -1];
    }

}
