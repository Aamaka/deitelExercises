package tddClass;

import chapter3.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock time;
    @BeforeEach
    public void startWith(){
        time = new Clock(22,12,4);
    }

    @Test
    public void testForHourOfAClock() {
        time.setHour(24);
        assertEquals(0,time.getHour());
    }

    @Test
    public void testForMinutesOfAClock(){
        time.setMinutes(60);
        assertEquals(0,time.getMinutes());
    }

    @Test
    public void testForSecondsOfAClock(){
        time.setSeconds(60);
        assertEquals(0,time.getSeconds());
    }

@Test
    public void displayTimeTest(){
       time.setHour(23);
        time.setMinutes(23);
        time.setSeconds(23);
        assertEquals(23,23,23,time.getDisplayTime());
}
}