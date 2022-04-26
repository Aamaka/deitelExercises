package tddClass;

import chapter4.GasMileage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GasMileageTest {
    GasMileage mileage;
    @BeforeEach
    public void setUp(){
        mileage = new GasMileage();
    }
    @Test
    public void gasExist(){
        assertNotNull(mileage);
    }

    @Test
    public  void testForMileDriven(){
        mileage.setMile(25);
        assertEquals(25,mileage.getMile());
    }
    @Test
    public  void testForGallonsUsed(){
        mileage.setGallon(34);
        assertEquals(34,mileage.getGallon());
    }

    @Test
    public void testForMilePerGallon(){
        mileage.setMile(25);
        mileage.setGallon(4);
        assertEquals(25,mileage.getMile());
        assertEquals(4,mileage.getGallon());
        assertEquals(6.25,mileage.getMilePerGallon());
    }

}
