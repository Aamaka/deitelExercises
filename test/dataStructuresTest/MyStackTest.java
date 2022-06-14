package dataStructuresTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dataStructures.MyStack;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack stack;
    @BeforeEach
    public  void setUp(){
        stack = new MyStack();
    }

    @Test
    public void testThatStackExist(){
        assertNotNull(stack);
    }
    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatCanAddAnItem(){
        stack.push("shoe");
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testThatStackIsNotEmpty(){
        stack.push("shoe");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStackCanHaveMoreThanOneItems(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        stack.push("cloth");
        assertEquals(4,stack.getSize());
    }

    @Test
    public void testThatStackHasAFixedLength(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        stack.push("cloth");
        stack.push("cloth");
        stack.push("cloth");
        assertEquals(5,stack.getSize());
    }

    @Test
    public void testThatStackCanCheckItems(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        stack.push("cloth");
        stack.push("purse");
        stack.push("clot");
        assertEquals(5,stack.getSize());
        assertEquals("purse", stack.peek());
    }

    @Test
    public void testThatStackCanPeek(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        assertEquals(3,stack.getSize());
        assertEquals("pot", stack.peek());
        assertEquals(3,stack.getSize());
    }

    @Test
    public void testThatWeCanPushAndPop(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        assertEquals("pot",stack.pop());
        assertEquals(2,stack.getSize());
    }

    @Test
    public void testThatWeCanPushPopAndPeek(){
        stack.push("shoe");
        stack.push("bags");
        stack.push("pot");
        assertEquals("pot", stack.peek());
        assertEquals("pot",stack.pop());
        assertEquals(2,stack.getSize());
        assertEquals("bags", stack.peek());
    }


}
