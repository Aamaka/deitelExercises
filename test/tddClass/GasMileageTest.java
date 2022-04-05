package tddClass;

import chapter4.GasMileage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    @Test
    public  void testForMileDriven(){
        GasMileage mileage = new GasMileage();
        mileage.setMile(25);
        assertEquals(25,mileage.getMile());
    }
    @Test
    public  void testForGallonsUsed(){
        GasMileage mileage = new GasMileage();
        mileage.setGallon(34);
        assertEquals(34,mileage.getGallon());
    }
}
