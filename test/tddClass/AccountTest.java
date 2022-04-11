package tddClass;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account amakaAccount;
    @BeforeEach
    public void beginWith(){
        amakaAccount = new Account();
    }

    @Test
    public void depositTest() {
        amakaAccount.deposit(100);
        assertEquals(100, amakaAccount.getBalance());


    }

    @Test
    public void depositTwiceTest() {
        Account amakaAccount = new Account();
        amakaAccount.deposit(500);
        amakaAccount.deposit(400);
        assertEquals(500 + 400, amakaAccount.getBalance());

    }

    @Test
    public void negativeDepositTest() {
        Account amakaAccount = new Account();
        amakaAccount.deposit(1000);
        amakaAccount.deposit(-500);
        assertEquals(1000., amakaAccount.getBalance());


    }

    @Test
    public void withdrawalTest() {
        Account amakaAccount = new Account();
        amakaAccount.deposit(2000);
        amakaAccount.withdrawal(200);
        assertEquals(1800, amakaAccount.getBalance());

    }
    @Test
    public void withdrawalMore(){
        Account amakaAccount = new Account();
        amakaAccount.deposit(1000);
        amakaAccount.withdrawal(1600);
        assertEquals(1000,amakaAccount.getBalance());

    }


}