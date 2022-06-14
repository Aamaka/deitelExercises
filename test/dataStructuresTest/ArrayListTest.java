package dataStructuresTest;

import dataStructures.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList arrays;
    @BeforeEach
    public void startWith(){
        arrays = new ArrayList();
    }

    @Test
    public void testThatArrayListCanBeCreated(){
        assertNotNull(arrays);
    }

    @Test
    public void testThatArrayListIsEmpty(){
        assertTrue(arrays.isEmpty());
    }


   @Test
    public void testThatWeCanAdd(){
        arrays.add(14);
        assertEquals(1, arrays.size());
        assertFalse(arrays.isEmpty());
   }


   @Test
    public void testThatYouCanAddMultiple(){
        arrays.add(15);
        arrays.add(16);
        arrays.add(17);
        arrays.add(18);
       assertEquals(4, arrays.size());
   }

   @Test
    public void testThatWeCanAddAtIndex(){
        arrays.add(0, 88);
        arrays.add(1, 8);
        arrays.add(2, 80);
        arrays.add(3, 87);
        arrays.add(4, 188);
        arrays.add(5, 3);
        arrays.add(6, 68);
        arrays.add(7, 58);
        arrays.add(8, 48);
        arrays.add(9, 28);
        arrays.add(10, 228);
        arrays.add(11, 182);
        arrays.add(12, 185);
        arrays.add(13, 189);
        arrays.add(14, 10);
        arrays.add(16, 180);
        assertEquals(16,arrays.size());

   }

   @Test
    public void testThatElementCanBeRemoved(){
       arrays.add(0, 88);
       arrays.add(1, 8);
       arrays.add(2, 80);
       arrays.add(3, 87);
       arrays.add(4, 18);
       arrays.remove(1);
       assertEquals(4,arrays.size());
   }

   @Test
    public void testThatYouCanSwapIndex(){
       arrays.add(0, 88);
       arrays.add(1, 8);
       arrays.add(2, 80);
       arrays.add(3, 87);
       arrays.add(4, 18);
       arrays.set(4, 888);
       assertEquals(888,arrays.get(4) );
       assertEquals(5,arrays.size());
   }

   @Test
    public void testThatListCanGet(){
        arrays.add(6);
        arrays.add(7);
        arrays.add(5);
        arrays.add(4);
        assertEquals(4,arrays.size());
        assertEquals(5,arrays.get(2) );
   }

   @Test
    public void AddAndRemove(){
       arrays.add(6);
       arrays.add(7);
       arrays.add(5);
       arrays.add(4);
       assertEquals(4,arrays.size());
       arrays.remove(3);
       assertEquals(3,arrays.size());
       assertEquals(4,arrays.get(3));

   }

    @Test
    public void listCanBeCleared(){
        arrays.add(6);
        arrays.add(7);
        arrays.add(5);
        arrays.add(4);
        arrays.clear();
        assertEquals(0, arrays.size());
    }

    @Test
    public void testThatArrayIsFull(){
        arrays.add(6);
        arrays.add(7);
        arrays.add(5);
        arrays.add(4);
        arrays.add(44);
        arrays.add(67);
        arrays.add(67);
        assertEquals(7,arrays.size());
    }
}
