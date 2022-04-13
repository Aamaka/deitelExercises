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

    public Acc register(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        Acc account = new Acc( accountNumber,firstName,lastName,pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
        return account;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Acc findAccount(int accountNumber) {
        int indexOfAccount = accountNumber - 1;
        return accounts[indexOfAccount];
        //return accounts[accountNumber - 1];
    }


    public void deposit(int amount, String accountNumber) {
        Acc account = findAccount(Integer.parseInt(accountNumber));
        account.deposit(amount);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        Acc account = findAccount(Integer.parseInt(accountNumber));
        account.withdraw(amount,pin);

    }

    public void transfer(int amount, String from, String to, String senderPin) {
        Acc senderAccount = findAccount(Integer.parseInt(from));
        Acc receiverAccount =findAccount(Integer.parseInt(to));
        senderAccount.withdraw(amount,senderPin);
        receiverAccount.deposit(amount);
    }
}
