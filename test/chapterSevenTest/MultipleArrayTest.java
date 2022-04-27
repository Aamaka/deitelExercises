package chapterSevenTest;

import chapter7.MultipleArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleArrayTest {
    @Test
    public void ArrayCountIsCreated(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        MultipleArray array1 = new MultipleArray();
        assertEquals(231,array1.sumMyArray(array));
    }

    @Test
    public void swapArray(){
        int[] array = {1,2,3,4,5,7,7,8,9,10,11,77};
        MultipleArray array1 = new MultipleArray();
        assertEquals(22,array1.getSumOfSwappedArray(array));
    }
    @Test
    public void multiplyArray(){
        int[] bonus = {1,2,3,4};
        MultipleArray array1 = new MultipleArray();
        assertEquals(20,array1.getMyBonus(bonus));
    }

}
