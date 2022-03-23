package tddClass;

import javaAssignment.Ac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
    @Test
    public void createAc(){
        Ac amaka = new Ac();
        assertNotNull(amaka);
    }
@Test
public void powerOnAcTest(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
    assertTrue(amaka.isOnOff());
}
    @Test
    void acPowerOffTest(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
        amaka.switchOnOff();
        assertFalse(amaka.isOnOff());
    }



    @Test
    public void temperature(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
        amaka.increaseTemperature();
        assertEquals(17, amaka.getTemperature());

    }
@Test
    public void decreaseTemperature(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
        amaka.increaseTemperature();
        amaka.decreaseTemperature();
        assertEquals(16, amaka.getTemperature());
}
@Test
    public void temperatureBeyond30(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
        int counter = 16;
        while (counter < 30) {
            amaka.increaseTemperature();
            counter++;
        }
        assertEquals(30, amaka.getTemperature());
}
@Test
    public void temperatureCannotGoBelow16(){
        Ac amaka = new Ac();
        amaka.switchOnOff();
        int counter = 16;
        while (counter < 22){
            amaka.increaseTemperature();
            counter++;
        }
        amaka.decreaseTemperature();
        amaka.decreaseTemperature();
        amaka.decreaseTemperature();
        amaka.decreaseTemperature();
        amaka.decreaseTemperature();
        amaka.decreaseTemperature();
       amaka.decreaseTemperature();
    assertEquals(16, amaka.getTemperature());
}
}
