package dataStructuresTest;

import dataStructures.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue queue;
    @BeforeEach
    public void startWith(){
        queue = new MyQueue();
    }
    @Test
    public void testThatMyQueueExist(){
        assertNotNull(queue);
    }

    @Test
    public void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatAnElementCanBeAddedToTheQueue(){
        queue.enqueue(9);
        assertEquals(9,queue.peek());
    }

    @Test
    public void testThatElementsCanBeAddedTooTheQueue(){
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        assertEquals(3,queue.peek());
    }

    @Test
    public void testThatQueueHasALimit(){
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        assertEquals(3,queue.peek());
    }

    @Test
    public void testThatDequeueIsPossible(){
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        assertEquals(3,queue.peek());
        queue.dequeue();
        assertEquals(6, queue.peek());
        queue.display();
    }

}
