package Chapter6Test;

import Chapter6.Division;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void TestForDivision(){
        Division myDivision = new Division();
        myDivision.setDivisibleNumbers(7,6,8,9,4,5,6,2,3,1);

    }
}
