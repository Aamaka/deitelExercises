package chapter9Tests;

import chapter9.Employee;
import chapter9.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void createSuperClass(){
        Employee store = new  Employee("amaka", "fay", "12e3",10_000,"4/5/6");
        store.setName("fay", "bay");
        assertEquals("fay bay", store.getName());

        assertEquals("12e3",store.getId());

        store.setSalary(10_200);
        assertEquals(10_200,store.getSalary());

        store.setDiscount(12.50);
        assertEquals(12.50,store.getDiscount());

        assertEquals(30_600,store.CalculateSalaryPerYear(3));
    }

    @Test
    public void managerTest(){
        Manager manager = new Manager("may","joy","122t4",20_000,"1234","03/4/7");
        manager.setName("bae","boo");
        assertEquals("bae boo",manager.getName());

        assertEquals("122t4",manager.getId());

        assertEquals(20_000,manager.getSalary());

        manager.setPassWord("45678");
        assertEquals("45678",manager.getPassWord());

        manager.setDiscount(2.2);
        assertEquals(2.2,manager.getDiscount());

        assertEquals(4400000.0,manager.getRaise());

        manager.setDateOfBirth(12,12,2012);
        assertEquals("12/12/2012",manager.getDateOfBirth());
    }



}
