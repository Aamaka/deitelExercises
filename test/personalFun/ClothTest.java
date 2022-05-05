package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClothTest {
    private Cloth cloth;
    @BeforeEach
    public void startWith(){
        cloth = new Cloth(55,"zebra","blue",22,"blouse");
    }

    @Test
    public void getSize() {
        assertEquals(55,cloth.getSize());
    }

    @Test
    public void getDesign() {
        assertEquals("zebra",cloth.getDesign());
    }

    @Test
    public void getColour() {
        assertEquals("blue",cloth.getColour());
    }

    @Test
    public void getLength() {
        assertEquals(22,cloth.getLength());
    }

    @Test
    public void getType() {
        assertEquals("blouse",cloth.getType());
    }
}