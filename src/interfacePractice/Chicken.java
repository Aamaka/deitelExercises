package interfacePractice;

public class Chicken extends Animals{
    @Override
    public void move() {
        System.out.println("Chicken move");
    }

    public void run(){
        System.out.println("Chicken run");
    }
    public void crow(){
        System.out.println("Chicken crow");
    }
}
