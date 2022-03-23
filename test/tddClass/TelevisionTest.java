package tddClass;

import javaAssignment.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television sony ;
    @BeforeEach
    public void  startWith(){
        sony = new Television();
    }


    @Test
    public void createTelevision() {
        assertNotNull(sony);
    }

    @Test
    public void televisionOn() {
        sony.turnOnOff();
        assertTrue(sony.isOnOff());
    }

    @Test
    public void televisionOff() {
        sony.turnOnOff();
        sony.turnOnOff();
        assertFalse(sony.isOnOff());
    }



    @Test
    public void volume() {
        sony.turnOnOff();
        int increaseVolume = 0;
        while(increaseVolume < 5) {
            sony.increaseVolume();
            increaseVolume++;
        }
        assertEquals(5, sony.getVolume());
    }

    @Test
    public void decreaseVolume() {
        sony.turnOnOff();
        int increaseVolume = 0;
        while(increaseVolume < 14) {
            sony.increaseVolume();
            increaseVolume++;
        }
        sony.decreaseVolume();
        assertEquals(13, sony.getVolume());
    }

    @Test
    public void setVolumeLimit() {
        sony.turnOnOff();
        assertTrue(sony.isOnOff());
        int increaseVolume = 0;
        while(increaseVolume < 30) {
            sony.increaseVolume();
            increaseVolume++;
        }
        assertEquals(30, sony.getVolume());
    }

    @Test
    public void decreaseVolumeLimit() {
        sony.turnOnOff();
        int increaseVolume = 0;
        while (increaseVolume < 17){
            sony.increaseVolume();
            increaseVolume++;
        }
        int decreaseVolume = 0;
        while (decreaseVolume < 27){
            sony.decreaseVolume();
            decreaseVolume++;
        }



    }

    @Test
    public void changeChannelIncrease() {
        sony.turnOnOff();
        int channelIncrease = 0;
        while (channelIncrease < 10){
            sony.channelIncrease();
            channelIncrease++;
        }
        assertEquals(10, sony.getChannels());
    }

    @Test
    public void changeChannelDecrease() {
        sony.turnOnOff();
        int channelIncrease = 0;
        while (channelIncrease < 10){
            sony.channelIncrease();
            channelIncrease++;
        }
        int channelDecrease = 0;
        while (channelDecrease < 5){
            sony.channelDecrease();
            channelDecrease++;
        }

        assertEquals(5, sony.getChannels());
    }

    @Test
    public void switchChannels() {
        sony.turnOnOff();
        sony.setChannels(78);
        sony.newChannel(40);
        sony.newChannel(55);
        assertEquals(40, sony.getChannels());
    }

    @Test
    public void brightness() {
        sony.turnOnOff();
        int increaseBrightness = 0;
        while (increaseBrightness < 7){
            sony.increaseBrightness();
            increaseBrightness++;
        }

        assertEquals(7, sony.getBrightness());
    }

    @Test
    public void brightnessDecrease() {
        sony.turnOnOff();
        int increaseBrightness = 0;
        while (increaseBrightness < 12){
            sony.increaseBrightness();
            increaseBrightness++;
        }
        int decreaseBrightness = 0;
        while (decreaseBrightness < 5){
            sony.decreaseBrightness();
            decreaseBrightness++;
        }

        assertEquals(5, sony.getBrightness());
    }
    @Test
    public void  increaseBrightnessLimit(){
        sony.turnOnOff();
        int increaseBrightness = 0;
        while (increaseBrightness < 12 ){
            sony.increaseBrightness();
            increaseBrightness++;
        }
        assertEquals(10,sony.getBrightness());
    }
    @Test
    public void decreaseBrightnessLimit(){
        sony.turnOnOff();
        int increaseBrightness = 0;
        while (increaseBrightness < 10){
            sony.increaseBrightness();
            increaseBrightness++;
        }
        int decreaseBrightness = 0;
        while (decreaseBrightness < 11){
            sony.decreaseBrightness();
            decreaseBrightness++;
        }

        assertEquals(0,sony.getBrightness());
    }

   @Test
    public void muteAndUnmute(){
     sony.turnOnOff();
     int increaseVolume = 0;
     while (increaseVolume < 5){
         sony.increaseVolume();
         increaseVolume++;
     }
     sony.isMute();
     assertTrue(sony.getIsMute());
     sony.increaseVolume();
     assertFalse(sony.getIsMute());
       assertEquals(6,sony.getVolume());
   }


}

