package chapter10slide;

public class Titus extends Fish{
    @Override
    public void moves() {
        System.out.println("fin");
    }

    @Override
    public void eat() {
        System.out.println("little fishes");
    }

    @Override
    public void speak() {
        System.out.println("hmm");
    }
}
