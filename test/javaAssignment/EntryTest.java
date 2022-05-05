package javaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {

    @Test
   public void getTitle() {
        Entry entry = new Entry("love", "12:12:12","[i love love, love love me]");
        assertEquals("love",entry.getTitle());
    }

    @Test
    public void getDate() {
        Entry entry = new Entry("love", "12:12:12","[i love love, love love me]");
        assertEquals("12:12:12",entry.getDate());
    }

    @Test
    public void getBody() {
        Entry entry = new Entry("love", "12:12:12","[i love love, love love me]");
        assertEquals("[i love love, love love me]",entry.getBody());
    }
}