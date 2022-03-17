package tddClass;

import org.junit.jupiter.api.Test;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void addTest() {
        kata calculator = new kata();
        int actual = calculator.add(4, 3);
        assertEquals(7, actual);
    }

    @Test
    public void subtractionTest() {
        kata calculator = new kata();
        int result = calculator.subtract(7, 2);
        assertEquals(5, result);

    }

    @Test
    public void absoluteSubtraction() {
        kata calculator = new kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void calculationAreaTest() {
        kata circle = new kata();
        double result = circle.findAreaWith(7);
        assertEquals(154.0, result);

    }

    @Test
    public void bitFlipperTest() {
        kata flipper = new kata();
        /**int result = flipper.flip(0);
         assertEquals(1 ,result);**/

        int result = flipper.flip(1);
        assertEquals(0, result);

    }

    @Test
    public void testThat1_4CopiesIs2000() {
        kata jamb = new kata();
     int copies =  jamb.numberOfCopies(4);
        assertEquals(8000, copies);
    }

    @Test
    public void testThat5_9CopiesIs2000() {
        kata jamb = new kata();
     int copies=   jamb.numberOfCopies(9);
        assertEquals(16_200, copies);
    }

    @Test
    public void testThat10_29CopiesIs2000() {
        kata jamb = new kata();
       int copies = jamb.numberOfCopies(29);
        assertEquals(46_400, copies);
    }

    @Test
    public void testThat30_49CopiesIs2000() {
        kata jamb = new kata();
        int copies = jamb.numberOfCopies(49);
        assertEquals(73_500, copies);
    }
    @Test
    public void testThat50_99CopiesIs2000() {
        kata jamb = new kata();
       int copies= jamb.numberOfCopies(99);
        assertEquals(128_700, copies);
    }
    @Test
    public void testThat100_199CopiesIs2000() {
        kata jamb = new kata();
      int copies=  jamb.numberOfCopies(199);
        assertEquals(238_800, copies);
    }
    @Test
    public void testThat200_499CopiesIs2000() {
        kata jamb = new kata();
      int copies=  jamb.numberOfCopies(499);
        assertEquals(548_900, copies);
    }
    @Test
    public void testThat500AndAboveCopiesIs2000() {
        kata jamb = new kata();
       int copies= jamb.numberOfCopies(550);
        assertEquals(550_000, copies);

    }

    @Test
    public void testForQuotient(){
        kata quo = new kata();
       int result = quo.divisionOfTwoNumbers(10,2);
        assertEquals(5,result);
    }

    @Test
    public void testWhileLoop(){
        int number = 0;
       // int number = 1;
        while(number < 100){
           number = number + 2;
            System.out.print(number+ " ");
            //number = number + 2;
        }



    }
    }