package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car cruise ;
    @BeforeEach
    public void startWith(){
        cruise = new ();
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
        cruise.turnOn();
        cruise.setModel("Benz");
        assertEquals("Benz", cruise.getModel());
  }




}
