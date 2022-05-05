package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {
    Phone phone;
    @BeforeEach
    public void setUp(){
        Screen screen = new Screen(22,"HD","touch");
        phone = new Phone(screen,33,"pink","good");
    }

    @Test
    public void testForScreen() {
        assertEquals(22,phone.getScreen().getSize());
        assertEquals("HD",phone.getScreen().getResolution());
        assertEquals("touch",phone.getScreen().getType());
    }

    @Test
    public void getSize() {
        assertEquals(33,phone.getSize());
    }

    @Test
   public void getColour() {
        assertEquals("pink",phone.getColour());
    }

    @Test
    public void getCamera() {
        assertEquals("good",phone.getCamera());
    }
}