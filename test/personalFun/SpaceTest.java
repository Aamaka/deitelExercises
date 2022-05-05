package personalFun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceTest {

    @Test
    void getLength() {
        Building space = new Building(22.4,34.6);
        space.setLength(8.9);
        assertEquals(8.9,space.getLength());
    }

    @Test
    void getHeight() {
        Building space = new Building(22.4,34.6);
        space.setHeight(5.6);
        assertEquals(5.6,space.getHeight());
    }


}