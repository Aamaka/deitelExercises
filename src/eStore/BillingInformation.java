package eStore;

public class BillingInformation {
    String receiverPhoneNumber;
    String receiverName;
     DeliveryAddress deliveryAddress;
    CreditCardInformation creditCardInformation;

    public BillingInformation(String receiverPhoneNumber, String receiverName, DeliveryAddress deliveryAddress, CreditCardInformation creditCardInformation) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }
}
