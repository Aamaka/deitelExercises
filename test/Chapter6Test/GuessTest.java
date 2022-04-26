package Chapter6Test;

import chapter6.Guess;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuessTest {
    @Test
    public void TestForGuess(){
        Guess guess = new Guess();
        guess.myGuess(13);
        assertEquals(6,guess.getGuess());

    }
}
