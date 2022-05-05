package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoeTest {
    Shoe shoes;
    @BeforeEach
    public  void setUp(){
        shoes = new Shoe(22,"blue","gucci","flat","rainbow");
    }

    @Test
    public void testForSize() {
        assertEquals(22,shoes.getSize());
    }

    @Test
    public void testForColour() {
        assertEquals("blue",shoes.getColour());
    }

    @Test
    public void testForModel() {
        assertEquals("gucci",shoes.getModel());
    }

    @Test
    public void testForType() {
        assertEquals("flat",shoes.getType());
    }

    @Test
    public void testForDesign() {
        assertEquals("rainbow",shoes.getDesign());
    }
}