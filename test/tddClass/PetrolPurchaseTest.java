package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
  PetrolPurchase myPetrol;
  @BeforeEach
  public void startWith(){
      myPetrol = new PetrolPurchase("Abuja", "fuel", 5,300.50,0.5);
  }

@Test
        void setMyPetrol(){
        myPetrol.setLocation("Abuja");
        assertEquals("Abuja",myPetrol.getLocation());
    }
    @Test
    public void typeOfPetol(){
        myPetrol.setPetrolType("fuel");
        assertEquals("fuel",myPetrol.getPetrolType());
    }

    @Test
    public void quantity(){
        myPetrol.setQuantity(5);
       assertEquals( 5,myPetrol.getQuantity());
    }

   @Test
    public void price(){
       myPetrol.setPrice(300.50);
       assertEquals( 300.50,myPetrol.getPrice());
   }

   @Test
    public void percentageDiscount(){
       myPetrol.setPercentageDiscount(2);
       assertEquals( 65_900.0,myPetrol.getPercentageDiscount());
   }

   @Test
    public void purchase(){
      myPetrol.getPurchaseAmount();
       assertEquals( 1_645.5,myPetrol.getPurchaseAmount());
   }

}
