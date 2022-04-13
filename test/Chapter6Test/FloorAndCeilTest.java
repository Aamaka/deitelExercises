package Chapter6Test;

import chapter5.chapter6.FloorAndCeil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloorAndCeilTest {
    FloorAndCeil myFloor;
    @BeforeEach
    public  void setUp(){
        myFloor = new FloorAndCeil();
    }
    @Test
    public  void testForFloor(){
        myFloor.setFloor(23.0,26.5,23.4,90.2,13.6);
        assertEquals(90.2,myFloor.getFloor());
    }

    @Test
    public void testForCeil(){
        myFloor.setCeil(22.1,12.6,14.6,16.7,19.6);
        assertEquals(12.6,myFloor.getCeil());
    }
}
