package turtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue ;
    @BeforeEach
    public void startWith(){
         queue = new  Queue();
    }

    @Test
    public void testThatQueueExist(){
        assertNotNull(queue);
    }
    @Test
    public void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatElementCanBeAdded(){
        queue.add(90);
        assertEquals(1,queue.getSize());
    }

    @Test
    public void testThatQueueIsNotEEmpty(){
        queue.add(90);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatQueueThatIncrease(){
        queue.add(90);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        assertEquals(4, queue.getSize());
    }

    @Test
    public void testThatQueueHasAFixedLength(){
        queue.add(90);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(9);
        queue.add(9);
        assertEquals(5,queue.getSize());
    }

    @Test
    public void testThatQueueCanBeRemoved(){
        queue.add(50);
        queue.add(34);
        queue.add(32);
        queue.remove();
        assertEquals(34,queue.peek());
        assertEquals(2,queue.getSize());
    }
    @Test
    public void testThatPeekWorks(){
        queue.add(50);
        queue.add(34);
        queue.add(32);
        assertEquals(50,queue.peek());
        assertEquals(3,queue.getSize());
    }



}
