package semesters.turtleTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Position;
import turtle.SketchPad;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {

    private Turtle turtle;
    private SketchPad pad;
    @BeforeEach
    public void startWith(){
        turtle = new Turtle();
        pad = new SketchPad(0,0);
    }

    @Test
    public void createTurtle(){
        Assertions.assertNotNull(turtle);
    }

    @Test
    public void testThatPenIsUpByDefault(){
        Assertions.assertFalse(turtle.isPenDown());
    }

    @Test
    public void testThatPenIsDown(){
         turtle.penDown();
        Assertions.assertTrue(turtle.isPenDown());
    }

    @Test
    public void testThatPenIsUp(){
        turtle.penDown();
        Assertions.assertTrue(turtle.isPenDown());
        turtle.penUp();
        Assertions.assertFalse(turtle.isPenDown());
    }

    @Test
    public  void turtleFacesEastByDefaultTest(){
        turtle.penDown();
        Assertions.assertTrue(turtle.isPenDown());
        Assertions.assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromSouthTest(){
        turtle.turnRight();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
    }


    @Test
    public void turtleCanFaceNorth(){
        turtle.turnRight();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanFaceEast(){
        turtle.turnRight();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFromEast(){
        turtle.turnLeft();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void testCanTurnLeftFromNorth(){
        turtle.turnLeft();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromWest(){
        turtle.turnLeft();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromSouth(){
        turtle.turnLeft();
        Assertions.assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanGoForward(){
        turtle.penDown();
        turtle.moveForward(5, pad);
        Assertions.assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    public void testToGoForwardFacingSouth(){
        turtle.penDown();
       turtle.moveForward(5, pad);
        turtle.turnRight();
        turtle.moveForward(5, pad);
        Assertions.assertEquals(new Position(4,4), turtle.getCurrentPosition());
    }

    @Test
    public void testToGoForwardFacingWest(){
        turtle.moveForward(3, pad);
        turtle.turnRight();
        turtle.moveForward(5, pad);
        turtle.turnLeft();
        turtle.moveForward(2, pad);
        turtle.turnRight();
        turtle.moveForward(4, pad);
        Assertions.assertSame(WEST, turtle.getCurrentDirection());
        Assertions.assertEquals(new Position(7,3),turtle.getCurrentPosition());
    }

    @Test
    public void whenPenIsDownTurtleWritesFacingEastTest(){
        turtle.penDown();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveForward(5, pad);
        String expected = "* * * * * \n     \n     \n     \n     \n";

        Assertions.assertEquals(expected,pad.toString());

    }
}
