package javaAssignment;

import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entries;
    private String name;
   private int noOfEntries;
   private  String PASSWORD;
    private boolean islock;


    public Diary(String name, String passWord) {
        this.name = name;
        this.PASSWORD = passWord;
        entries = new ArrayList<>(noOfEntries);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createEntry(String title, String date, String body) {
        Entry entry = new Entry(title,date,body);
        entries.add(noOfEntries,entry);
        noOfEntries++;
    }

    public int getNumberOfEntry() {
        return noOfEntries;

    }

    public void findEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(entry.getTitle().equals(title)){
                entries.get(noOfEntries - 1);
                noOfEntries--;
            }
        }
    }


    public void deleteAnEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(entry.getTitle().equals(title)){
                entries.remove(entry);
                noOfEntries--;
            }
        }
    }
    public void deleteAll() {
        entries.clear();
        noOfEntries = 0;
    }

    public void EntryLock(String passWord) {
        if(passWord.equals(PASSWORD)){
            islock = !islock;
        }
    }

    public boolean isLock() {
        return islock;
    }
}



