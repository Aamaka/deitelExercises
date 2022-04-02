package tddClass;

public class AccountsTest {

    public static void main(String[] args) {

        Accounts tola = new Accounts("tolani akinsola", "5857585669");
        tola.deposit(1000);
        System.out.println(Accounts.balance);

        tola.withdrawal(5);
        System.out.println(Accounts.balance);

        tola.withdrawal(100);
        System.out.println(Accounts.balance);

        Accounts amaka = new Accounts("Amacool","3456789876");
        tola.transfer(amaka,550);
        System.out.println(Accounts.balance);
        System.out.println(Accounts.balance);

        Accounts.setInterestRate(10);
//        amaka.addInterestRate();
        System.out.println(amaka.addInterestRate());
    }

}
