package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccTests {
    Acc amaka;
    Acc fay;

    @BeforeEach
    public void startWith() {
        amaka = new Acc("213445","mama","peace","1234");
        fay = new Acc("567891","Bola","Ugo","5678");
    }

    @Test
    public void createAccount() {
        assertNotNull(amaka);
        assertNotNull(fay);
        assertEquals("213445",amaka.getAccountNumber());
        assertEquals("mama peace",amaka.getAccountName());
        assertEquals("567891",fay.getAccountNumber());
        assertEquals("Bola Ugo",fay.getAccountName());
    }

    @Test
    public void gettingBalanceWithRightPin() {
        amaka.deposit(500);
        amaka.deposit(500);
        assertEquals(1000, amaka.getBalance("1234"));
        fay.deposit(500);
        fay.deposit(700);
        assertEquals(1200, fay.getBalance("5678"));
    }

    @Test
    public void withdrawalWithRightPinTest(){
        amaka.deposit(5000);
        assertEquals(5000, amaka.getBalance("1234"));

        fay.deposit(7000);
        assertEquals(7000, fay.getBalance("5678"));

        amaka.withdraw(6000,"1234");
        fay.withdraw(2000,"5678");

        assertEquals(0,amaka.getBalance("1234"));
        assertEquals(5000,fay.getBalance("5678"));
    }


}
