package turtleTest;

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
    public void testThatPenIsUp(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public  void turtleFacesEastByDefaultTest(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromSouthTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }


    @Test
    public void turtleCanFaceNorth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanFaceEast(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST,turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFromEast(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void testCanTurnLeftFromNorth(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromWest(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftFromSouth(){
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanGoForward(){
        turtle.penDown();
        turtle.moveForward(5, pad);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

    @Test
    public void testToGoForwardFacingSouth(){
        turtle.penDown();
       turtle.moveForward(5, pad);
        turtle.turnRight();
        turtle.moveForward(5, pad);
        assertEquals(new Position(4,4), turtle.getCurrentPosition());
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
        assertSame(WEST, turtle.getCurrentDirection());
        assertEquals(new Position(7,3),turtle.getCurrentPosition());
    }

    @Test
    public void whenPenIsDownTurtleWritesFacingEastTest(){
        turtle.penDown();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveForward(5, pad);
        String expected = "* * * * * \n     \n     \n     \n     \n";

        assertEquals(expected,pad.toString());

    }
}
