package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

   private Stack stack;
    @BeforeEach
    public void startWith(){
        stack = new Stack();
    }
    @Test
    public  void stackCanBeCreated(){
        assertNotNull(stack);
    }
    @Test
    public void StackIsEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushAnElement(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_stackShouldBeEmptyTest(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXAndY_popX_stackShouldNotBeEmptyTest(){
        stack.push(13);
        stack.push(11);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_elementShouldBeTest(){
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(13);
        stack.push(12);
        int element = stack.pop();
        assertEquals(13,element);
    }

    @Test
    public void pushXAndY_popYAndX_elementIsYAndXTest(){
        stack.push(12);
        stack.push(10);
        int element = stack.pop();
        assertEquals(10,element);
         element = stack.pop();
        assertEquals(12,element);
    }

    @Test
    public void pushXAndY_peekReturnsYTest(){
        stack.push(12);
        stack.push(10);
        int element = stack.peek();
        assertEquals(10,element);
        element = stack.pop();
        assertEquals(10,element);
        element = stack.peek();
        assertEquals(12,element);


    }
}
