package dependencyInjection;

public class Fly implements Movement{

    @Override
    public void move() {
        System.out.println("i fly");
    }
}
