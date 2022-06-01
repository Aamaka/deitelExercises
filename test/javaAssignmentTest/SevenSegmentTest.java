package javaAssignmentTest;

import org.junit.jupiter.api.Test;

public class SevenSegmentTest {
    @Test
    public void arrayIsCreated(){
        SevenSegment segment = new SevenSegment();
        segment.printSegmentDisplay("11111110");
        segment.printSegment();
    }
}
