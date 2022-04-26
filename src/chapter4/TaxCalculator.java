package chapter4;

public class TaxCalculator {

    private String tax;

    public void collectEarnings(int amt1, int amt2, int amt3) {
       tax = amt1 +" "+ amt2 +" " + amt3;
    }

    public String getTax() {
        return tax;
    }
}
