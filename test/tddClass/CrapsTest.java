package tddClass;

import eBanking.Craps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrapsTest {
    Craps craps;
    @BeforeEach
    public void startWith(){
        craps = new Craps();
    }

    @Test
    public void testFoFirstRoll(){
        Craps craps = new Craps();
        craps.isPlaying();
        assertTrue(craps.getIsPlaying());
    }
    @Test
    public void tstForFirstRoll(){
        craps.rollDice(2,5);
        assertEquals("you win",craps.getRoll());
    }
    @Test
    public void tstForRoll(){
        craps.rollDice(6,5);
        assertEquals("you win",craps.getRoll());
    }
    @Test
    public void tstForMoreRoll(){
        craps.rollDice(6,6);
        assertEquals("you lose",craps.getRoll());
    }
    @Test
    public void tstForLesserRoll(){
        craps.rollDice(1,3);
        assertEquals("you win",craps.getRoll());
    }


}
