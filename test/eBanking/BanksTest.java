package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BanksTest {
    Banks myBank;
    @BeforeEach
    public void startWith(){
         myBank = new Banks("uba",20);
    }
    @Test
    public void bankCanBeCreated(){
        assertNotNull(myBank);
    }
    @Test
    public void nameOfBankTest(){
        assertEquals("uba",myBank.getName());
    }
    @Test
    public void numberOfCustomersTest(){
        assertEquals(20,myBank.getMaximumNumberOfCustomers());
    }

    @Test
    public void bankAccountCanBeCreated(){
        myBank.createBankAccounts("hope","peace","1111");
        myBank.createBankAccounts("hatred","peace","2222");
        myBank.createBankAccounts("aka","peace","3333");
        myBank.createBankAccounts("maka","peace","4444");
        myBank.createBankAccounts("love","peace","5555");
        myBank.createBankAccounts("joy","peace","6666");
        myBank.createBankAccounts("amuse","peace","7777");
        myBank.createBankAccounts("amazed","peace","8888");
        myBank.createBankAccounts("asher","peace","9999");
        myBank.createBankAccounts("love","peace","1234");
        assertEquals(10,myBank.getNumberOfCustomers());
    }

    @Test
    public void bankAccountCheck(){
        myBank.createBankAccounts("hope","peace","1111");
        myBank.createBankAccounts("hatred","peace","2222");
        myBank.createBankAccounts("aka","peace","3333");
        myBank.createBankAccounts("maka","peace","4444");
        myBank.createBankAccounts("love","peace","5555");
        myBank.createBankAccounts("joy","peace","6666");
        assertEquals(6,myBank.getNumberOfCustomers());

        Acc account = myBank.findAccount(5);
        assertEquals("love peace",account.getAccountName());
        assertEquals("5",account.getAccountNumber());
    }
}
