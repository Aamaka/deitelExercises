package eStore;

public class Customers extends Users{
     BillingInformation billingInformation;
    ShoppingCart shoppingCart;

    public Customers(int age, String emailAddress, HomeAddress homeAddress, String name, String password, String phone) {
        super(age, emailAddress, homeAddress, name, password, phone);
    }
}
