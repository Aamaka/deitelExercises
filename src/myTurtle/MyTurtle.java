package myTurtle;

import static myTurtle.MyDirection.*;

public class MyTurtle {
    Pens pen = new Pens();
    Positions positions = new Positions(0,0);
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

    public void move(int noOfSteps, NotePad pad) {
        if(isPenDown()){
            if(direction  == EAST) writeAcrossColumnBy(noOfSteps, pad);
            if(direction  == SOUTH) writeAcrossRowBy(noOfSteps, pad);
            if(direction  == WEST) writeBackwardAcrossColumnBy(noOfSteps, pad);
        }

        if(direction == EAST)increaseByColumn(noOfSteps);
        if(direction == SOUTH)increaseByRow(noOfSteps);
        if(direction == WEST) decreaseByColumn(noOfSteps);
        if(direction == NORTH) decreaseByRow(noOfSteps);
    }

    private void writeBackwardAcrossColumnBy(int noOfSteps, NotePad pad) {
        int[][] arr = pad.getArr();
        int row = positions.getRow();
        int column = positions.getColumn();
        noOfSteps = column - noOfSteps;
        for (int i = column; i > noOfSteps; i--) {
            arr[row][i] = 1;
        }
    }

    private void writeAcrossRowBy(int noOfSteps, NotePad pad) {
        int[][] arr = pad.getArr();
        int row = positions.getRow();
        int column = positions.getColumn();
        noOfSteps += row;
        for (int i = row; i < noOfSteps; i++) {
            arr[i][column] = 1;
        }
    }

    private void writeAcrossColumnBy(int noOfSteps, NotePad pad) {
        int[][] arr = pad.getArr();
        int row = positions.getRow();
        int column = positions.getColumn();
        noOfSteps += column;
        for (int i = column; i < noOfSteps; i++) {
            arr[row][i] = 1;

        }
    }

    private void decreaseByRow(int noOfSteps) {
        int currentRowPosition = positions.getRow();
        positions.setRow(currentRowPosition -(noOfSteps - 1));
    }

    private void decreaseByColumn(int noOfSteps) {
        int currentColumnPosition = positions.getColumn();
        positions.setColumn(currentColumnPosition - (noOfSteps - 1));
    }

    private void increaseByRow(int noOfSteps) {
        int currentRowPosition = positions.getRow();
        positions.setRow(currentRowPosition + noOfSteps - 1);
    }

    private void increaseByColumn(int noOfSteps) {
        int currentColumnPosition = positions.getColumn();
        positions.setColumn(currentColumnPosition + noOfSteps - 1);
    }

    public Positions getCurrentPosition() {
        return positions;
    }
}
