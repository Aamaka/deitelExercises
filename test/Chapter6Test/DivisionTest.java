package Chapter6Test;

import chapter6.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    @Test
    public void TestForDivision(){
        Division myDivision = new Division();
        myDivision.setDivisibleNumbers(7,6,8,9,4,5,6,2,3,1);
        assertFalse(myDivision.isDivisible());
    }


    @Test
    public void TestForPositiveDivision(){
        Division myDivision = new Division();
        myDivision.setDivisibleNumbers(5,10,15,20,25,30,35,40,45,50);
        assertTrue(myDivision.isDivisible());
    }

    @Test
    public void TestForPositiveAndNegativeDivision(){
        Division myDivision = new Division();
        myDivision.setDivisibleNumbers(6,10,15,20,25,31,36,47,49,50);
        assertTrue(myDivision.isDivisible());
    }
}
