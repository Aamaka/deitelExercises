package chapter9Tests;

import chapter9.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    @Test
    public void managerTest(){
        Manager manager = new Manager("may","joy","122t4",20_000,"1234","03/4/7");
        manager.setName("bae","boo");
        assertEquals("bae boo",manager.getName());

        assertEquals("122t4",manager.getId());

        assertEquals(20_000,manager.getSalary());

        manager.setPassWord("45678");
        assertEquals("45678",manager.getPassWord());



        assertEquals(20_500,manager.getRaise(500));

        manager.setDateOfBirth(12,12,2012);
        assertEquals("12/12/2012",manager.getDateOfBirth());
    }
}
