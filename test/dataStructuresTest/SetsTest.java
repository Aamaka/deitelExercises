package dataStructuresTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dataStructures.Sets;

import static org.junit.jupiter.api.Assertions.*;

public class SetsTest {
    private  Sets sets;
    @BeforeEach
    public void setUp(){
        sets = new Sets();
    }

    @Test
    public void testThatSetExist(){
        assertNotNull(sets);
    }

    @Test
    public void testThatSetIsEmpty(){
        assertTrue(sets.isEmpty());
    }

    @Test
    public void testThatSetIsNotEmpty(){
        sets.add(0,5);
        assertFalse(sets.isEmpty());
    }

    @Test
    public void testThatWeCanAdd(){
        sets.add(0,5);
        sets.add(1,4);
        sets.add(2,8);
        sets.add(3,6);
        sets.add(4,7);
        assertEquals(5,sets.size());
    }

    @Test
    public void testThatWeCantHaveDuplicate(){
        sets.add(0,4);
        sets.add(1,4);
        sets.add(2,8);
        sets.add(3,6);
        sets.add(4,7);
        sets.add(5,8);
        assertEquals(4,sets.size());
    }

    @Test
    public  void testThatElementCanBeAddedWithoutIndex(){
        sets.add(44);
        sets.add(44);
        assertEquals(1,sets.size());
    }
}
