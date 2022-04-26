package chapter4Test;

import chapter4.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator tax;
    @BeforeEach
    public void startWith(){
        tax = new TaxCalculator();
    }
    @Test
    public void testForEarnings(){
        tax.collectEarnings(100,200,300);
        assertEquals(100,200,300,tax.getTax());
    }

}
