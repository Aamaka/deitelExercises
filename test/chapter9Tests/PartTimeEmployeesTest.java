package chapter9Tests;

import chapter9.PartTimeEmployees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTimeEmployeesTest {
    private  PartTimeEmployees employ ;
    @BeforeEach
    public void setUp(){
        employ = new PartTimeEmployees("tola", "shame", "123er4", 100_000, "12/12/2012",123.9);
    }

    @Test
    public void testForConstructor() {
        assertEquals("tola shame",employ.getName());
        assertEquals("123er4",employ.getId());
        assertEquals(100_000,employ.getSalary());
        assertEquals(200_000,employ.getRaise(100_000));
    }
  @Test
    public void testForHourlyPay(){
        employ.setHourPay(1000.50);
        assertEquals(1000.50,employ.getHourPay());
  }

  @Test
    public void testForWeeklyPay(){
        employ.setHourPay(2000.50);
        assertEquals(6001.5,employ.calculateWeeklyPay(3));
  }

}