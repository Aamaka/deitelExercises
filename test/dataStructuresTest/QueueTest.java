package dataStructuresTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dataStructures.Queue;

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
        queue.enqueue(90);

    }

    @Test
    public void testThatQueueIsNotEEmpty(){
        queue.enqueue(90);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatQueueThatIncrease(){
        queue.enqueue(90);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        assertEquals(7, queue.peek());
    }

    @Test
    public void testThatQueueHasAFixedLength(){
        queue.enqueue(90);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(9);
        queue.enqueue(9);
        assertEquals(90,queue.peek());

    }

    @Test
    public void testThatQueueCanBeRemoved(){
        queue.enqueue(50);
        queue.enqueue(34);
        queue.enqueue(32);
        queue.dequeue();
        assertEquals(34,queue.peek());

    }
    @Test
    public void testThatPeekWorks(){
        queue.enqueue(50);
        queue.enqueue(34);
        queue.enqueue(32);
        assertEquals(50,queue.peek());
    }



}
