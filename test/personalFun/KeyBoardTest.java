package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KeyBoardTest {
 KeyBoard keys;
 @BeforeEach
 public void startWith(){
     keys = new KeyBoard(false,false,22);
 }
    @Test
    public void isKeyBoardLight() {
        keys.onKeyBoard();
        assertTrue(keys.isKeyBoardLight());
    }

    @Test
    public void isFingerPrint() {
        keys.fingerPrint();
        assertTrue(keys.isFingerPrint());
    }

    @Test
    public void getSize() {
        assertEquals(22,keys.getSize());
    }
}