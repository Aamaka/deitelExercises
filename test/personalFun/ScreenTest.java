package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScreenTest {
    Screen screen;
    @BeforeEach
    public  void setUp(){
        screen = new Screen(22,"HD","touch");
    }

    @Test
    public void getSize() {
        assertEquals(22,screen.getSize());
    }

    @Test
    public void getResolution() {
        assertEquals("HD",screen.getResolution());
    }

    @Test
    public void getType() {
        assertEquals("touch",screen.getType());
    }
}