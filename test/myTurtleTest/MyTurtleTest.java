package myTurtleTest;

import myTurtle.MyTurtle;
import myTurtle.NotePad;
import myTurtle.Positions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static myTurtle.MyDirection.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTurtleTest {
    private MyTurtle turtle;
    NotePad pad;
    @BeforeEach
    public void setUp(){
        turtle = new MyTurtle();
        pad = new NotePad(5,5);
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
    public void turtleCanGoForwardFromEast(){
        turtle.move(5, pad);
        assertEquals(new Positions(0, 4), turtle.getCurrentPosition());
    }
    @Test
    public void movingToSouth(){
        turtle.move(5, pad);
        assertEquals(new Positions(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.move(5, pad);
        assertEquals(new Positions(4, 4), turtle.getCurrentPosition());
    }
    @Test
    public void  movingToWest(){
        turtle.move(5, pad);
        assertEquals(new Positions(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.move(5, pad);
        assertEquals(new Positions(4, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());
        turtle.move(3, pad);
        assertEquals(new Positions(4, 2), turtle.getCurrentPosition());
    }
    @Test
    public void movingToNorth(){
        turtle.move(5, pad);
        assertEquals(new Positions(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.move(5, pad);
        assertEquals(new Positions(4, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());
        turtle.move(3, pad);
        assertEquals(new Positions(4, 2), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(5, pad);
        assertEquals(new Positions(0, 2), turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanWriteToEast(){
        turtle.penDown();
        turtle.move(5, pad);
        assertEquals(new Positions(0,4), turtle.getCurrentPosition());
        String expected = """
                * * * * *\s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected,pad.toString());
    }
    @Test
    public void testThatTurtleCanWriteTowardSouth(){
        turtle.penDown();
        turtle.move(5, pad);
        assertEquals(new Positions(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(5, pad);
        assertEquals(new Positions(4,4), turtle.getCurrentPosition());
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                        *\s
                """;
        assertEquals(expected,pad.toString());
    }

    @Test
    public void testThatTurtleCanWriteTowardWest(){
        turtle.penDown();
        turtle.move(5, pad);
        assertEquals(new Positions(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(5, pad);
        assertEquals(new Positions(4,4), turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.move(5, pad);
        assertEquals(new Positions(4,0), turtle.getCurrentPosition());
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                * * * * *\s
                """;
        assertEquals(expected,pad.toString());
    }

}
