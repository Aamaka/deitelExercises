package chapter3Tests;

import chapter3.HeartRecords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRecordsTest {
    HeartRecords records;
    @BeforeEach
    public  void startWith(){
        records = new HeartRecords("bello","nay",2013,7,6,7,"female",23.3,13.5);
    }
    @Test
    public void testForGender(){
        records.setGender("female");
        assertEquals("female",records.getGender());
    }
    @Test
    public void testForWeight(){
        records.setWeight(12.8);
        assertEquals(12.8,records.getWeight());
    }
    @Test
    public void testForHeight(){
        records.setHeight(16.9);
        assertEquals(16.9,records.getHeight());
    }
    @Test
    public  void calculateBMI(){
        records.setWeight(123.4);
        records.setHeight(45.2);
        assertEquals(42,records.getBIM());
    }
}
