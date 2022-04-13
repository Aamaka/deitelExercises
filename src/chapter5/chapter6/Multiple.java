package chapter5.chapter6;

public class Multiple {
    boolean mode;

    public void takeInNumbers(int num1, int num2) {
        mode = num1 % num2 == 0;
    }


    public boolean getIsMultiple() {
        return mode;
    }
}
