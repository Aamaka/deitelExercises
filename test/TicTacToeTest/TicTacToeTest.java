package TicTacToeTest;

import Tictactoe.GameBoard;
import Tictactoe.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {
    private TicTacToe toe;
    private GameBoard gameBoard;
    @BeforeEach
    public void startWith(){
        toe = new TicTacToe();
        gameBoard = new GameBoard();

    }

    @Test
    public void testThatTic_tac_toe_exist(){
        assertNotNull(toe);
    }

    @Test
    public void testThatTicTacToeHasABoard(){
        toe.gameBoard();
    }
    @Test
    public void testThatATicTacTacHasAPlayer(){
        toe.gameBoard();
        toe.playerName("bola");
        assertEquals("bola", toe.getPlayer());
    }

    @Test
    public void testThatTic_tac_toeHasABoard(){
        toe.gameBoard();
//        toe.play("bola", 7);
        String expected = """
                 | |\s
                -+-+-
                 | |\s
                -+-+-
                 | |\s
                """;
        assertEquals(expected,gameBoard.toString());
    }
    @Test
    public void testThatAPlayerCanPlay(){

    }

}
