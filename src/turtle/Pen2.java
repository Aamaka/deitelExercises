package turtle;

public class Pen2 {
   boolean isDown = false;
    public void pensDown() {
        isDown = true;
    }

    public void isPenUp() {
        isDown = false;
    }

    public boolean getPosition() {
        return isDown;
    }

}
