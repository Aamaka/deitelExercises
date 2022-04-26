package Chapter6Test;

import chapter6.Hypotenuse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {

    @Test
    public void findHypotenuse(){
        Hypotenuse myHypotenuse = new Hypotenuse();
        myHypotenuse.myLength(3.0,4.0);
        assertEquals(5.0,myHypotenuse.getHypotenuseSquare());
    }

    @Test
    public  void HypotenuseOfAnotherTriangle(){
        Hypotenuse myHypotenuse = new Hypotenuse();
        myHypotenuse.myLength(4.0,3.0);
        assertEquals(5.0,myHypotenuse.getHypotenuseSquare());
    }
}
