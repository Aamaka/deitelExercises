package javaAssignment;

import java.util.ArrayList;

public class MyDiary {
    private String name;
    private final String passWord;
    private ArrayList<MyEntry> entries;
    private boolean isLock;

    final int INVALID_NUMBER = -15;

    public MyDiary(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
        entries = new ArrayList<>();
    }

    public void createEntry(String date, String title, String body) {
        MyEntry entry = new MyEntry(date,title, body);
        entries.add(entry);
    }

    public int getNoOfEntries() {
        return entries.size();
    }
    public int findEntryByTitle(String title) {
        for (int i = 0; i < entries.size(); i++) {
            MyEntry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                return (i + 1);
            }
        }
        return -5;
    }

    public int findEntryByDate(String date) {
        for (int i = 0; i < entries.size(); i++) {
            MyEntry entry = entries.get(i);
            if (entry.getDate().equals(date)) {
                return i + 1;
            }
        }
        return INVALID_NUMBER;
    }
    public void deleteEntryByTitle(String title, String pass) {
        if(pass.equals(passWord))
           entries.remove(findEntryByTitle(title)- 1);
    }
    public void deleteEntryByDate(String date,String pass) {
        if(pass.equals(passWord))
            entries.remove(findEntryByDate(date)-1);
    }

    public void isUnLock(String pass) {
        if(pass.equals(passWord))
             isLock = !isLock;
    }
    public boolean isLock(){
        return isLock;
    }

    public void deleteAll() {
        entries.clear();
    }
}