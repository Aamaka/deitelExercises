package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotherBoardTest {
    MotherBoard board;
    @BeforeEach
    public void StartWith(){
        board = new MotherBoard("key",8);
    }

    @Test
    public void getChips() {
        assertEquals("key",board.getChips());
    }

    @Test
    public void getMemory() {
        assertEquals(8,board.getMemory());
    }
}