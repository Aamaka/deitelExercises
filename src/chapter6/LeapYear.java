package chapter6;

public class LeapYear {
    boolean mode;

    public void setYear(int myYear) {
        mode = ((myYear % 4 == 0) && (myYear % 100 != 0)) || (myYear % 400 == 0);
    }

    public boolean isLeapYear() {
        return mode;
    }
}
