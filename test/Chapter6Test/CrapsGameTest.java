package Chapter6Test;

import chapter6.CrapsGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CrapsGameTest {
    private CrapsGame game;

    @BeforeEach
    public void setUp() {
        game = new CrapsGame();
    }

    @Test
    public void testThatGamExist() {
        assertNotNull(game);
    }
    @Test
    public void testThatADiceCanBeRolledInGame(){
        
    }

}
