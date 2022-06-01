package myTurtleTest;

import myTurtle.MyDirection;
import myTurtle.MyTurtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static myTurtle.MyDirection.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTurtleTest {
    private MyTurtle turtle;
    @BeforeEach
    public void setUp(){
        turtle = new MyTurtle();
    }

    @Test
    public void testThatTurtleIsCreated(){
        assertNotNull(turtle);
    }

    @Test
    public void testThatPenIsUpByDefault(){
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void testThatPenIsDown(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }

    @Test
    public void testThatPenIsUpAndGoesDown(){
        assertFalse(turtle.isPenDown());
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void turtleFacesEastByDefaultTest(){
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromSouthTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanFaceNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanFaceEast(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFromEast(){
        turtle.turnLeft();
        assertSame(NORTH,turtle.getCurrentDirection());
    }

    @Test
    public void testCanTurnLeftFromNorth(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST,turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromWest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromSouth(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanGoForward(){

    }


}
