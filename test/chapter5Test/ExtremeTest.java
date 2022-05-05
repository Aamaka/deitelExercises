package chapter5Test;

import chapter5.Extreme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtremeTest {
    @Test
    public void testForLargest(){
        Extreme num = new Extreme();
        num.collectNum(2,4,5,6,7);
        assertEquals(7,num.getLargest());
    }
    @Test
    public void testForSmallest(){
        Extreme num = new Extreme();
        num.collectNum(2,4,5,6,7);
        assertEquals(2,num.getSmallest());
    }
    @Test
    public void sumOfExtremes(){
        Extreme num = new Extreme();
        num.collectNum(2,4,5,6,7);
        assertEquals(9,num.getSum());
    }
}
