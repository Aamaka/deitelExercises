package chapter10slide;

public class StarFish extends Fish{
    @Override
    public void moves() {
        System.out.println("fast");
    }

    @Override
    public void eat() {
        System.out.println("yum");
    }

    @Override
    public void speak() {
        System.out.println("qui");
    }
}
