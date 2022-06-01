package myTurtle;

public class Pens {
    boolean isDown = false;
    public void penDown() {
        isDown = true;
    }

    public boolean isPenDown() {
        return isDown;
    }

    public void penUp() {
        isDown = false;
    }
}
