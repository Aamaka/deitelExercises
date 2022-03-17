package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoBikeTest {
    AutoBike myAutoBike;
    @BeforeEach
    public void startWith(){
        myAutoBike = new AutoBike();
    }

    @Test
    public void createBike() {
        assertNotNull(myAutoBike);
    }

    @Test
    public void swithOn() {
        myAutoBike.onOff();
        assertTrue(myAutoBike.isOn());
    }

    @Test
    public void switchOff() {
        myAutoBike.onOff();
        myAutoBike.onOff();
        assertFalse(myAutoBike.isOn());
    }

    @Test
    public void acceleration() {
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 21) {
            myAutoBike.accelerate();
            accelerate++;
        }

        assertEquals(21, myAutoBike.getSpeed());
    }

    @Test
    public void accelerationBy2() {
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 22) {

            myAutoBike.accelerate();
            accelerate++;
        }

        assertEquals(23, myAutoBike.getSpeed());
    }

    @Test
    public void accelerationBy3() {
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 27) {
            myAutoBike.accelerate();
            accelerate++;
        }


        assertEquals(34, myAutoBike.getSpeed());
    }

    @Test
    public void accelerationBy4() {
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 28) {
            myAutoBike.accelerate();
            accelerate = accelerate + 1;
        }

        assertEquals(37, myAutoBike.getSpeed());
    }

    @Test
    public void decceleraion() {
        myAutoBike.onOff();
        int deccelate = 21;
        while (deccelate > 0) {
            myAutoBike.deccelerate();
            deccelate --;
        }
        assertEquals(0, myAutoBike.getSpeed());

    }

    @Test
    public void deccelaationBy1() {
        myAutoBike.onOff();
        int acceleration = 0;
        while (acceleration < 13) {
            myAutoBike.accelerate();
            acceleration++;
        }
        int deccelerate = 6;
        while (deccelerate > 0) {
            myAutoBike.deccelerate();
            deccelerate--;
        }
        assertEquals(7, myAutoBike.getSpeed());

    }

    @Test
    public void deccelerateBy2() {
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 23) {
            myAutoBike.accelerate();
            accelerate++;
        }
        int deccelerate = 5;
        while (deccelerate > 0) {
            myAutoBike.deccelerate();
            deccelerate--;
        }
        assertEquals(17, myAutoBike.getSpeed());
    }

    @Test
    public void deccelerationBy3(){
        myAutoBike.onOff();
        int accelerate = 0;
        while (accelerate < 26){
            myAutoBike.accelerate();
            accelerate++;
        }
        int decceleration = 5;
        while (decceleration > 0 ){
            myAutoBike.deccelerate();
            decceleration--;
        }
        assertEquals(20,myAutoBike.getSpeed());
    }

    @Test
    public void decceleationBy4(){
        myAutoBike.onOff();
        int acclerateCounter = 0;
        while (acclerateCounter < 31){
            myAutoBike.accelerate();
            acclerateCounter++;
        }
        int decceleration = 3;
        while ( decceleration > 0){
            myAutoBike.deccelerate();
            decceleration--;
        }
        assertEquals(40,myAutoBike.getSpeed());
    }
}