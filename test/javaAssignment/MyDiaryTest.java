package javaAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyDiaryTest {
   @Test
   public void createMyDiary() {
      MyDiary diary = new MyDiary("lala", "12w3");
      assertNotNull(diary);
   }

   @Test
   public void entryCanBeCreated() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      assertEquals(1, diary.getNoOfEntries());
   }

   @Test
   public void moreEntryCanBeCreated() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      diary.createEntry("12:12:12", "my lov", "lalalalalal");
      assertEquals(6, diary.getNoOfEntries());
   }

   @Test
   public void testToFindMyEntry() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:12", "my lov", "laja");
      diary.createEntry("12:12:12", "pace", "baba");
      diary.createEntry("12:12:12", "my joy", "lalao");
      diary.createEntry("12:12:12", "peace", "lala");
      int link = diary.findEntryByTitle("my joy");
      assertEquals(3, link);
   }

   @Test
   public void testToFindEntryByDate() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:1819", "my lov", "laja");
      diary.createEntry("12:12:2012", "pace", "baba");
      diary.createEntry("12:12:2002", "my joy", "lalao");
      diary.createEntry("12:12:2011", "peace", "lala");
      int link = diary.findEntryByDate("12:12:2012");
      assertEquals(2, link);
   }
   @Test
   public void testForDeleteByTitle() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:1819", "my lov", "laja");
      diary.createEntry("12:12:2012", "pace", "baba");
      diary.createEntry("12:12:2002", "my joy", "lalao");
      diary.createEntry("12:12:2011", "peace", "lala");
      assertEquals(4, diary.getNoOfEntries());
      diary.deleteEntryByTitle("pace","12w3");
      assertEquals(3, diary.getNoOfEntries());
      int link = diary.findEntryByTitle("pace");
      assertEquals(-5, link);

   }

   @Test
   public void testForDeleteByDate() {
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:1819", "my lov", "laja");
      diary.createEntry("12:12:2012", "pace", "baba");
      diary.createEntry("12:12:2002", "my joy", "lalao");
      diary.createEntry("12:12:2011", "peace", "lala");
      assertEquals(4, diary.getNoOfEntries());
      diary.deleteEntryByDate("12:12:2011","12w3");
      assertEquals(3, diary.getNoOfEntries());
   }
   @Test
   public void testForLockAndUnLock(){
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.isUnLock("12w3");
      assertTrue(diary.isLock());
   }
   @Test
   public void testForDeleteAll(){
      MyDiary diary = new MyDiary("lala", "12w3");
      diary.createEntry("12:12:1819", "my lov", "laja");
      diary.createEntry("12:12:2012", "pace", "baba");
      diary.createEntry("12:12:2002", "my joy", "lalao");
      diary.createEntry("12:12:2011", "peace", "lala");
      diary.deleteAll();
      diary.createEntry("12:12:2011", "peace", "lala");
      assertEquals(1,diary.getNoOfEntries());
   }
}
