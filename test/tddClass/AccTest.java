package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccTest {
    Acc babe ;
    @BeforeEach
    public void startWith(){
        babe = new Acc();
    }

    @Test
    public void deposit(){
        babe.deposit(500);
        assertEquals(500,babe.getBalance());

    }
    @Test
    public void depositTwice(){
        babe.deposit(300);
        babe.deposit(400);
        assertEquals(700,babe.getBalance());
    }
    @Test
    public void negativeDeposit(){
        babe.deposit(-400);
        assertEquals(0, babe.getBalance());
    }
    @Test
    public void withdraw(){
        babe.deposit(1000);
        babe.withdraw(400);
        assertEquals(600,babe.getBalance());
    }
    @Test
     public void withdrawMore(){
        babe.deposit(500);
        babe.withdraw(600);
        assertEquals(500,babe.getBalance());
    }

}
