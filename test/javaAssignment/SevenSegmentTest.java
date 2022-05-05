package javaAssignment;

import org.junit.jupiter.api.Test;

public class SevenSegmentTest {
    @Test
    public void arrayIsCreated(){
        SevenSegment segment = new SevenSegment();
        segment.printSegmentDisplay("01100001");
        segment.printSegment();
    }
}
