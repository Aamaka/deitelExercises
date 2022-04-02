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
        amaka = new Acc();
        fay = new Acc();
    }

    @Test
    public void createAccount() {
        assertNotNull(amaka);
        assertNotNull(fay);
    }

    @Test
    public void assignPin() {
        amaka.amakaDeposit(500);
        assertEquals(500, amaka.getBalance1("1234"));
    }

    @Test
    public void assignPin2() {
        fay.fayDeposit(500);
        assertEquals(500, fay.getBalance2("5678"));

    }
}
