package chapter3Tests;

import chapter3.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRateTest {

    HeartRate myHeartRate;
    @BeforeEach
    public void startWith(){
        myHeartRate = new HeartRate("love","Hatred",2002,2022,2,6);
    }

    @Test
    public  void firstAndLastName(){
        myHeartRate.setFirstName("Love");
        assertEquals("Love",myHeartRate.getFirstName());

    }

    @Test
    public  void lastNameTest(){
        myHeartRate.setLastName("Hatred");
        assertEquals("Hatred",myHeartRate.getLastName());
    }


@Test
    public void testForYear(){
    myHeartRate.setYear(2022);
    assertEquals(2022,myHeartRate.getYear());
}

@Test
    public void testForYearOfBirth(){
        myHeartRate.setBirthYear(2002);
        assertEquals(2002,myHeartRate.getBirthYear());
}

@Test
    public  void setAgeOfBirth(){
        myHeartRate.setYear(2022);
        myHeartRate.setBirthYear(2002);
        assertEquals(20,myHeartRate.getAge());
}

@Test
    public  void testForMaximumHeartRate(){
     myHeartRate.setYear(2022);
     myHeartRate.setBirthYear(2002);
  assertEquals(200,myHeartRate.getMaximumHeartRate());
}

@Test
    public void targetHeartRate(){
        assertEquals(187,myHeartRate.getTarget());
    }

    @Test
    public void testForMonth(){
        myHeartRate.setMonth(13);
        assertEquals(13,myHeartRate.getMonth());
    }

    @Test
    public  void testForDay(){
        myHeartRate.setDay(6);
        assertEquals(6,myHeartRate.getDay());
    }

    @Test
    public void testForDateOfBirth(){
        myHeartRate.setDay(6);
        myHeartRate.setMonth(12);
        myHeartRate.setBirthYear(2002);
       assertEquals("12/6/2002",myHeartRate.getDateOfBirth());
    }
}


