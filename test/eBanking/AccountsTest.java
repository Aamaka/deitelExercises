package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountsTest {
    Accounts accounts ;
    @BeforeEach
    public void startWith(){
        accounts = new Accounts();
    }

    @Test
    public void testForOpeningAccount(){
        assertNotNull(accounts);
    }
   @Test
    public void testForDeposit(){
        accounts.deposit(500);
        assertEquals(500,accounts.getBalance());
   }
   @Test
    public void depositTwice(){
        accounts.deposit(500);
        accounts.deposit(200);
        assertEquals(700,accounts.getBalance());
   }
   @Test
    public void testForWithdrawal(){
        accounts.deposit(1000);
        accounts.withdraw(500);
        assertEquals(500,accounts.getBalance());
   }
   @Test
    public void testForExcessesWithdrawal(){
        accounts.deposit(1000);
        accounts.withdraw(1200);
//        accounts.getBalance();
        assertEquals(1000,accounts.getBalance());
   }
   @Test
    public void testToWithdrawWhenAmountIsZero(){
        accounts.withdraw(500);
       System.out.println(accounts);
        assertEquals(0,accounts.getBalance());
   }
   @Test
   public  void newAccount() {
       Accounts malik = new Accounts();
       assertNotNull(malik);
       System.out.println(malik);
       System.out.println(accounts);
   }
 @Test public void deposit(){
        Accounts malik = new Accounts();
        accounts.deposit(500);
        malik.deposit(200);
        assertEquals(500,accounts.getBalance());
        assertEquals(200,malik.getBalance());

 }

}
