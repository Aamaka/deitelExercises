package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyStringTest {
    private MyString string;
    @BeforeEach
    public void startWith(){
        string = new MyString();
    }

    @Test
    public void testThatMyStringClassExist(){
        assertNotNull(string);
    }

    @Test
    public void testThatInputMustBeGreaterThanTwo(){
        string.collectInput("ab");
        assertEquals(0, string.getLongestString());
    }

    @Test
    public void testThatStringCanBeCounted(){
        string.collectInput("abcadeccdccd");
        assertEquals(5, string.getLongestString());
    }
}
