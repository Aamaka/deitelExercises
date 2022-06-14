package dataStructuresTest;

import dataStructures.LinkedLists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListsTest {
    private LinkedLists list;
    @BeforeEach
    public void startWith(){
        list = new LinkedLists();

    }

    @Test
    public void testThatLinkedListExist(){
        assertNotNull(list);
    }

    @Test
    public void testThatListIsEmpty(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThatLinkedListUsesANode(){
        list.addFirst(56);
        assertEquals(1,list.getSize());
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThatWeCanAddTwice(){
        list.addFirst(56);
        list.addFirst(5);
        assertEquals(2,list.getSize());
    }
    @Test
    public void testThatWeCanPeek(){
        list.addFirst(56);
        list.addFirst(5);
        list.peek();

    }
    @Test
    public void testThatWeCanDelete(){
        list.addFirst(56);
        list.addFirst(5);
        list.addFirst(57);
        list.addFirst(566);
        list.deleteFirst();
        assertEquals(3, list.getSize());
    }
    

}
