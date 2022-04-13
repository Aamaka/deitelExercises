package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank firstBank;
    @BeforeEach
    public void startWith(){
        firstBank = new Bank("FirstBank",10);
    }

    @Test
    public void  bankCanBeCreatedTest(){
        assertNotNull(firstBank);
        assertEquals("FirstBank",firstBank.getName());
        assertEquals(10,firstBank.getMaximumNoOfCustomers());
    }
    @Test
    public  void bankCanCreateAccountTest(){
        firstBank.register("joy","peace","1245");
        firstBank.register("joy","peace","1245");
        assertEquals(2,firstBank.getNumberOfCustomers());

    }

    @Test
    public  void registerCheckForCustomerTest(){
        firstBank.register("joy","peace","1245");
        firstBank.register("joi","peace","1745");
        firstBank.register("joy","blade","1245");
        firstBank.register("joys","pace","12455");
        assertEquals(4,firstBank.getNumberOfCustomers());

        Acc account = firstBank.findAccount(4);
        assertEquals("joys pace",account.getAccountName());
        assertEquals("4",account.getAccountNumber());
    }
    @Test
    public void bankCanDepositMoneyTest(){
        firstBank.register("joy","peace","1245");
        firstBank.deposit(1200, "1");
        firstBank.deposit(1800, "1");
        Acc acc = firstBank.findAccount(1);
        assertEquals(3000,acc.getBalance("1245"));

    }
    @Test
    public  void bankCanWithdrawMoney(){
        firstBank.register("joy","peace","1245");
        firstBank.deposit(1200, "1");
        firstBank.withdraw(100, "1", "1245");

        Acc acc = firstBank.findAccount(1);
        assertEquals(1100,acc.getBalance("1245"));
    }

    @Test
    public void bankCanTransferMoneyTest(){
        firstBank.register("joy","peace","1245");
        firstBank.register("joi","peace","1745");

        firstBank.deposit(12000,"1");

        Acc acc = firstBank.findAccount(1);
        assertEquals(12000,acc.getBalance("1245"));

        firstBank.transfer(200,"1","2","1245");


         acc = firstBank.findAccount(1);
        assertEquals(11800,acc.getBalance("1245"));


        acc  = firstBank.findAccount(2);
        assertEquals(200,acc.getBalance("1745"));
    }

}
