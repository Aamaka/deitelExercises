package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
     Laptop pc;
    @BeforeEach
    public  void startWith(){
        KeyBoard key= new KeyBoard(false,false,22);
        MotherBoard board = new MotherBoard("HD",44);
        pc = new Laptop("Dell",key,board,33,"touch");
    }
    @Test
    public void getModel() {;
        assertEquals("Dell",pc.getModel());
    }

    @Test
    public void getKeyBoard() {
        pc.getKeyBoard().onKeyBoard();
        assertTrue(pc.getKeyBoard().isKeyBoardLight());
        pc.getKeyBoard().fingerPrint();
        assertTrue(pc.getKeyBoard().isFingerPrint());
        assertEquals(22,pc.getKeyBoard().getSize());

    }

    @Test
    public void getBoard() {
        assertEquals("HD",pc.getBoard().getChips());
        assertEquals(44,pc.getBoard().getMemory());
    }

    @Test
    public void getScreenSize() {
        assertEquals(33,pc.getScreenSize());
    }

    @Test
    public void getScreenType() {
        assertEquals("touch",pc.getScreenType());
    }
}