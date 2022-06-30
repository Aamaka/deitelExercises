package dependencyInjection;

public class Swim implements Movement{

    @Override
    public void move() {
        System.out.println("i swim");
    }
}
