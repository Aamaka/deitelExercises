package javaAssignmentTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyEntryTest {

    @Test
    public void getDate() {
        MyEntry entry = new MyEntry("12:12:12","me","how are you");
        assertEquals("12:12:12",entry.getDate());
    }

    @Test
    public void getTitle() {
        MyEntry entry = new MyEntry("12:12:12","me","how are you");
        assertEquals("me",entry.getTitle());
    }

    @Test
    public void getBody() {
        MyEntry entry = new MyEntry("12:12:12","me","how are you");
        assertEquals("how are you",entry.getBody());
    }
}