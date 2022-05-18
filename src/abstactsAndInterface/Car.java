package abstactsAndInterface;

public abstract class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("i move");
    }

    @Override
    public void turnRight() {
        System.out.println("turn right");
    }
    public abstract  void turnLeft();
}
