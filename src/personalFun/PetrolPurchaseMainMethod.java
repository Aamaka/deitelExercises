package personalFun;

import chapter3.PetrolPurchase;

public class PetrolPurchaseMainMethod {
    public static void main(String[] args) {
        PetrolPurchase myPetrol = new PetrolPurchase("abuja","fuel",200,500.0,7);
        System.out.println(myPetrol.getPetrolType());
        System.out.println(myPetrol.getPurchaseAmount());
        System.out.println(myPetrol.getPrice());
        System.out.println(myPetrol.getLocation());
        myPetrol.setPercentageDiscount(7);
        System.out.println(myPetrol.getPrice());
    }
}
