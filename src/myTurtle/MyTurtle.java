package myTurtle;

import static myTurtle.MyDirection.*;

public class MyTurtle {
    Pens pen = new Pens();
    MyDirection direction = MyDirection.EAST;
    public boolean isPenDown() {
        return pen.isPenDown();
    }
    public void penDown() {
        pen.penDown();
    }

    public void penUp() {
        pen.penUp();
    }

    public MyDirection getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        switch (direction){
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    private void face(MyDirection currentDirection) {
        direction = currentDirection;
    }

    public void turnLeft() {
        switch (direction){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }
}
