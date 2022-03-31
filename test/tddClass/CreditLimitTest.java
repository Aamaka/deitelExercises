package tddClass;

import chapter4.CreditLimit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitTest {
    CreditLimit bae;
    @BeforeEach
    public void startWith(){
        bae = new CreditLimit();
    }

    @Test
    public void testForAccountNumber(){
        bae.setAccountNumber(2234);
        assertEquals(2234,bae.getAccountNumber());
    }

    @Test
    public void balanceTest(){
        bae.setBalance(3000);
        assertEquals(3000,bae.getBalance());
    }
    @Test
    public  void totalItemCharged(){
        bae.setTotalItemCharged(2000);
        assertEquals(2000,bae.getTotalItemCharged());
    }
    @Test
    public void testForTotalCreditApplied(){
        bae.setCreditApplied(500);
        assertEquals(500, bae.getCreditApplied());
    }

    @Test
    public  void testForAllowedCreditLimit(){
        bae.setCreditLimit(5000);
        assertEquals(5000, bae.getCreditLimit());
    }
    @Test
    public void testForNewBalance(){
        bae.setBalance(5000);
        bae.setTotalItemCharged(2000);
        bae.setCreditApplied(4000);
        assertEquals(3000,bae.getNewBalance());
    }

    @Test
    public void checkCreditExceedTest(){
        bae.setCreditLimit(200);
        bae.setBalance(19500);
        bae.setTotalItemCharged(200);
        bae.setCreditApplied(700);
        bae.checkExceedLimit();
    }
}
