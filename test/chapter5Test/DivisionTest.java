package chapter5Test;

import chapter5.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Test
    public  void divisionTest(){
        Division myDiv = new Division();
        myDiv.numbers(35);
        assertEquals(198,myDiv.getAnswer());
    }

    @Test
    public  void divisionForTest(){
        Division myDiv = new Division();
        myDiv.numbers(99);
        assertEquals(1584,myDiv.getAnswer());
    }

    @Test
    public  void DivDivisionTest(){
        Division myDiv = new Division();
        myDiv.numbers(35);
        assertEquals(198,myDiv.getAnswer());
        myDiv.numbers(25);
        assertEquals(306,myDiv.getAnswer());
    }
}
