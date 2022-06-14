package chapter10slide;

public class Pigeon extends Bird{
    @Override
    public void moves() {
        System.out.println("fly away");
    }

    @Override
    public void eat() {
        System.out.println("beak beak");
    }

    @Override
    public void speak() {
        System.out.println("sing sing");
    }
}
