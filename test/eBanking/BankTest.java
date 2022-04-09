package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank firstBank;
    @BeforeEach
    public void startWith(){
        firstBank = new Bank("FirstName",10);
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
    public  void register_checkForCustomerTest(){
        firstBank.register("joy","peace","1245");
        firstBank.register("joi","peace","1745");
        firstBank.register("joy","blade","1245");
        firstBank.register("joys","pace","12455");
        assertEquals(4,firstBank.getNumberOfCustomers());

        Acc account = firstBank.findAccount(4);
        assertEquals("joys pace",account.getAccountName());
        assertEquals("4",account.getAccountNumber());
    }
}
