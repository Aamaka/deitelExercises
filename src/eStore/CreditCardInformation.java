package eStore;

public class CreditCardInformation {
    String CVV;
    int cardExpirationYear;
    String month;
    String creditCardNumber;
    String nameOnCard;
    CardType cardType;

    public CreditCardInformation(String CVV, int cardExpirationYear, String month, String creditCardNumber, String nameOnCard, CardType cardType) {
        this.CVV = CVV;
        this.cardExpirationYear = cardExpirationYear;
        this.month = month;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}
