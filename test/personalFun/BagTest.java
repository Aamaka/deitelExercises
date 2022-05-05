package personalFun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
      private Bag bags;
      @BeforeEach
      public void startWith(){
          bags = new Bag(22,"blue","hand bag","diamond","gucci");
      }

    @Test
    public void getSize() {
        assertEquals(22,bags.getSize());
    }

    @Test
    public void getColour() {
        assertEquals("blue",bags.getColour());
    }

    @Test
    public void getType() {
        assertEquals("hand bag",bags.getType());
    }

    @Test
    public void getDesign() {
        assertEquals("diamond",bags.getDesign());
    }

    @Test
    public void getModel() {
        assertEquals("gucci",bags.getModel());
    }
}