package chapter9Tests;

import chapter9.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Employee store ;
    @BeforeEach
    public void  setUp(){
        store = new Employee("bay", "fay", "12e3", 10_000, "4/5/6");
    }
    @Test
    public void createSuperClass() {
        store.setName("fay", "bay");
        assertEquals("fay bay", store.getName());
    }
    @Test
    public void iDTest() {
        assertEquals("12e3", store.getId());
    }

    @Test
    public void salaryTest() {
        store.setSalary(10_200);
        assertEquals(10_200, store.getSalary());
    }

    @Test
    public void salaryPerYear(){
        store.setSalary(20_500);
        assertEquals(20_500,store.getSalary());
        assertEquals(61_500,store.CalculateSalaryPerYear(3));
    }





}
