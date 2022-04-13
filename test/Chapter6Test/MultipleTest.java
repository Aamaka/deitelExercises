package Chapter6Test;

import chapter5.chapter6.Multiple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultipleTest {
    @Test
    public void testForMultiple(){
        Multiple myMultiple = new Multiple();
        myMultiple.takeInNumbers(65,5);
        assertTrue(myMultiple.getIsMultiple());
    }

    @Test
    public void testForWrongMultiple(){
        Multiple myMultiple = new Multiple();
        myMultiple.takeInNumbers(65,2);
        assertFalse(myMultiple.getIsMultiple());
    }
}

