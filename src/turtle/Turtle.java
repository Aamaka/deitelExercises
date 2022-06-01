package turtle;

import static turtle.Direction.*;

public class Turtle {

    private Pen2 biro = new Pen2();
    private Direction direct = EAST;
    private  final  Position position = new Position(0,0);

    public boolean isPenDown() {
        return biro.getPosition();

    }

    public void penDown() {
        biro.pensDown();
    }

    public void penUp() {
        biro.isPenUp();
    }

    public Direction getCurrentDirection() {
        return direct;
    }

    public void turnRight() {
        switch (direct){
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case EAST -> face(SOUTH);
            case NORTH -> face(EAST);
        }


    }

    private void face(Direction currentDirection) {
        direct = currentDirection;
    }

    public void turnLeft() {
        switch (direct){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
        }

    }


    public void moveForward(int noOfSteps, SketchPad pad) {
        if(isPenDown()){
            if(direct == EAST) writeOnColumn(noOfSteps, pad);
        }

        if(direct == EAST) increaseColumnBy(noOfSteps);
        if(direct == SOUTH) increaseRowBy(noOfSteps);
        if(direct == WEST) decreaseColumnBy(noOfSteps);
        if(direct == NORTH) decreaseRowBy(noOfSteps);
    }

    private void writeOnColumn(int noOfSteps, SketchPad pad) {
        int[][] floor = SketchPad.getFloor();
        int row = position.getRow();
        int column = position.getColumn();
        noOfSteps = noOfSteps + column;
        for (int i = column; i < column + noOfSteps; i++) {
            floor[row][i] = 1;
        }

    }

    private void decreaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition + noOfSteps + 1);
    }

    private void decreaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition + noOfSteps + 1);
    }

    private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition + noOfSteps - 1);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition + noOfSteps - 1);
    }

    public  Position getCurrentPosition(){
        return  position;
    }
}
