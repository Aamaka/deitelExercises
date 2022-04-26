package chapter6;

public class LeapYear {
    boolean mode;

    public void setYear(int myYear) {
        if(((myYear % 4 == 0) && (myYear % 100 != 0))|| (myYear % 400 == 0)) mode = true;
        else  mode = false;
    }

    public boolean isLeapYear() {
        return mode;
    }
}
