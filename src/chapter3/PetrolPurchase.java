package chapter3;

public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int quantity;
    private double price;
    private double discount ;
 public PetrolPurchase(String location, String petrolType, int quantity,double price, double discount){
this.location = location;
this.petrolType = petrolType;
this.quantity = quantity;
this.price = price;
this.discount = discount;
 }

    public void setLocation(String location) {
       this.location = location;

    }
    public String getLocation() {
        return location;
    }

    public void setPetrolType(String petrolType) {
       this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setQuantity(int litres ) {
     quantity = litres;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(double percent) {
       discount = (percent / 0.01) * price ;

    }

    public double getPercentageDiscount() {
        return discount;
    }

    public double getPurchaseAmount() {
        return (quantity * price) - discount;
    }
}
