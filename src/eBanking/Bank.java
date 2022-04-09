package eBanking;

public class Bank {
    private final String name;
    private Acc[] accounts ;
    private int numberOfCustomer;

    public Bank(String bankName, int numberOfCustomers) {
      name = bankName;
      accounts = new Acc[numberOfCustomers];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNoOfCustomers() {
        return accounts.length;
    }

    public void register(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        Acc account = new Acc( accountNumber,firstName,lastName,pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Acc findAccount(int accountNumber) {
        int indexOfAccount = accountNumber - 1;
        return accounts[indexOfAccount];
        //return accounts[accountNumber - 1];
    }



}
