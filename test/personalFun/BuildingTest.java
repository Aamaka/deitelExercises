package personalFun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildingTest {

    @Test
    public void getLength() {
        Building building = new Building(22,23);
        assertEquals(22.0,building.getLength());
    }

    @Test
    public void getHeight() {
        Building building = new Building(22,23);
        assertEquals(23.0,building.getHeight());
    }
}