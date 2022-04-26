package Chapter6Test;

import chapter6.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    @Test
    public void TestForLeapYear(){
        LeapYear myYear = new LeapYear();
        myYear.setYear(2022);
        assertFalse(myYear.isLeapYear());
    }
    @Test
    public void TestForALeapYear(){
        LeapYear myYear = new LeapYear();
        myYear.setYear(2024);
        assertTrue(myYear.isLeapYear());
    }

    @Test
    public void TestForNotLeapYear(){
        LeapYear myYear = new LeapYear();
        myYear.setYear(2200);
        assertFalse(myYear.isLeapYear());
    }
}
