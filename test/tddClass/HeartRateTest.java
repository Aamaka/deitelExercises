package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRateTest {

    HeartRate myHeartRate;
    @BeforeEach
    public void startWith(){
        myHeartRate = new HeartRate("love","Hatred",2002,2022,"march",6);
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
        myHeartRate.setBirthYear(2022);
        assertEquals(2022,myHeartRate.getBirthYear());
}

@Test
    public  void getAgeOfBirth(){
        myHeartRate.setYear(2022);
        myHeartRate.setBirthYear(2002);
        assertEquals(20,myHeartRate.getAge());
}

@Test
    public  void testForMaximumHeartRate(){
  myHeartRate.getMaximumHeartRate(20);
  assertEquals(200,myHeartRate.getMaximumHeartRate(20));
}

@Test
    public void targetHeartRate(){
        myHeartRate.getTarget();
        assertEquals(18700,myHeartRate.getTarget());
    }

    @Test
    public void tstForMonth(){
        myHeartRate.setMonth("march");
        assertEquals("march",myHeartRate.getMonth());
    }

    @Test
    public  void testForDay(){
        myHeartRate.setDay(6);
        assertEquals(6,myHeartRate.getDay());
    }

    @Test
    public void testForDateOfBirth(){
      //  myHeartRate.setDateOfBirth(3/6/2002);
        assertEquals(3/6/2002,myHeartRate.getDateOfBirth());
    }
}


