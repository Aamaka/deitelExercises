package chapter4Test;

import chapter4.Largest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestTest {
    @Test
    public void testForLargest(){
        Largest large = new Largest();
        large.collectNumbers(2,23,4,5,6,17,8,19,2,1);
        assertEquals(23,large.getLargest());
    }
}
