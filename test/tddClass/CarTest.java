package tddClass;

import chapter3.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car cruise ;
    @BeforeEach
    public void startWith(){
        cruise = new Car("Benz","1913",109.50);
    }
    @Test
    public void createCar(){
        assertNotNull(cruise);
    }
    @Test
    public void turnCarOn(){
        cruise.turnOn();
        assertTrue(cruise.isOn());
    }
  @Test
    public void turnCarOff(){
        cruise.turnOn();
        cruise.turnOn();
        assertFalse(cruise.isOn());
  }

  @Test
    public void carModel(){
        cruise.setModel("Benz");
        assertEquals("Benz", cruise.getModel());
  }

  @Test
    public void carYear(){
        cruise.setYear("1913");
        assertEquals("1913",cruise.getYear());
  }

   @Test
    public void carPrice(){
        cruise.setPrice(109.50);
        assertEquals(109.50,cruise.getPrice());

   }
     @Test
    public void negativePrice(){
        cruise.setPrice(-33.5);
        assertEquals(0,cruise.getPrice());
     }
     @Test
    public void testForTwoClasses(){
        Car cruise1 = new Car("camry","2013",12.51);
         Car cruise2 = new Car("jeep","2014",10.12);
        assertEquals(12.51,cruise1.getPrice());
        assertEquals(10.12,cruise2.getPrice());
     }

     @Test
    public void discountTest(){
         Car cruise1 = new Car("camry","2013",102.51);
         Car cruise2 = new Car("jeep","2014",106.12);
         cruise1.setDiscount(5);
         cruise2.setDiscount(7);
       assertEquals(5.125500000000001,cruise1.getPrice());
       assertEquals(7.4284,cruise2.getPrice());
     }

}
