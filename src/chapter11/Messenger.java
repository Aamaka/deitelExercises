package chapter11;

public class Messenger {
    public Beans buyBeans(int amount, boolean withOmiEwa, boolean isFake){

        return sendSomeOneElse(amount,withOmiEwa,isFake);
    }

    private Beans sendSomeOneElse(int amount, boolean withOmiEwa, boolean isFake) {
        if(amount < 100) throw new NullPointerException("you no get money");
        if(isFake) throw new IllegalArgumentException("jail");
        return new Beans(amount,withOmiEwa);
    }
}
