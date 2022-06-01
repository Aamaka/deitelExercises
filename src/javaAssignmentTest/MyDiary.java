package javaAssignmentTest;

import java.util.ArrayList;

public class MyDiary {
    private String name;
    private  String password;
    private ArrayList<MyEntry> entries;
    boolean mode;


    final int INVALID_NUMBER = -15;

    public MyDiary(String name,  String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<>();
    }
    public MyDiary(){
        entries = new ArrayList<>();
    }

    public void createEntry( String title, String body) {
            MyEntry entry = new MyEntry(title, body);
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
        if(pass.equals(password))
           entries.remove(findEntryByTitle(title)- 1);
    }
    public void deleteEntryByDate(String date,String pass) {
        if(pass.equals(password)){
            entries.remove(findEntryByDate(date)-1);}
    }

    public void deleteAll(String pass) {
        if(pass.equals(password))
            entries.clear();
    }

    public void unlockDiary(String pass) {
        if(pass.equals(password)){
            mode = true;}
        else
            mode = false;
    }

    public boolean validatePassword() {
        return mode;
    }



    @Override
    public String toString() {
        return "your name is " + name ;
    }

}