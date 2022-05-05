package javaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void diaryCanBECreated(){
        Diary diary = new Diary("lola","joy");
        assertNotNull(diary);
    }
    @Test
    public void myDiaryHasAName(){
        Diary diary = new Diary("lade","joy");
        diary.setName("lala");
        assertEquals("lala",diary.getName());
    }
    @Test
    public void testThatDiaryCanHaveAnEntry(){
        Diary diary = new Diary("lade","joy");
        diary.createEntry("love","12:11:12","that is a boy");
        diary.createEntry("love","12:11:12","that is a boy");
        diary.createEntry("love","12:11:12","that is a boy");
        diary.createEntry("love","12:11:12","that is a boy");
        assertEquals(4,diary.getNumberOfEntry());
    }
    @Test
    public void testForFindMyEntry(){
        Diary diary = new Diary("lade","joy");
        diary.createEntry("joy pace","12:11:12","that is a boy");
        diary.createEntry("love hope","12:11:12","that is a boy");
        diary.createEntry("lovee pui","12:11:12","that is a boy");
        diary.createEntry("loves lala","12:11:12","that is a boy");
        diary.findEntry("lovee pui");
        assertEquals(3,diary.getNumberOfEntry());
    }
    @Test
    public void testThatEntryCanBeDeleted(){
        Diary diary = new Diary("lala", "joy");
        diary.createEntry("joy pace","12:11:12","that is a boy");
        diary.createEntry("love hope","12:11:12","that is a boy");
        diary.createEntry("lovee pui","12:11:12","that is a boy");
        diary.createEntry("loves lala","12:11:12","that is a boy");
        assertEquals(4,diary.getNumberOfEntry());
        diary.deleteAnEntry("loves lala");
        assertEquals(3,diary.getNumberOfEntry());
    }
    @Test
    public void  testThatAllEntriesCanBeDeleted(){
        Diary diary = new Diary("lala", "joy");
        diary.createEntry("joy pace","12:11:12","that is a boy");
        diary.createEntry("love hope","12:11:12","that is a boy");
        diary.createEntry("lovee pui","12:11:12","that is a boy");
        diary.createEntry("loves lala","12:11:12","that is a boy");
        assertEquals(4,diary.getNumberOfEntry());
        diary.deleteAll();
        assertEquals(0,diary.getNumberOfEntry());
        diary.createEntry("loves lala","12:11:12","that is a boy");
        assertEquals(1,diary.getNumberOfEntry());
    }
    @Test
    public void testThatDiaryIsLocked(){
        Diary diary = new Diary("lala", "joy");
        diary.EntryLock("joy");
        assertTrue(diary.isLock());
    }
    @Test
    public void testThatMyDiaryIsSecured(){
        Diary diary = new Diary("lala", "joy");
        diary.EntryLock("peace");
        assertFalse(diary.isLock());
    }


}
