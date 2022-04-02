package eBanking;

public class Acc {
    private int amakaBalance;
    private int fayBalance;

    public void amakaDeposit(int amount) {
        amakaBalance =+ amount;
    }

    public int getBalance1(String pin) {
        if(pin.equals("1234"))
        return amakaBalance;
        return 0;
    }

    public void fayDeposit(int amount) {
        fayBalance =+ amount;
    }

    public int getBalance2(String pin) {
        if(pin.equals("5678"))
        return fayBalance;
        return 0;
    }
}
