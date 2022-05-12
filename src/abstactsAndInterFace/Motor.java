package abstactsAndInterFace;

public class Motor extends Car{
    @Override
    public void turnLeft() {
        System.out.println("turn left");
    }

    public void push(){
        System.out.println("push");
    }
    @Override
    public void move(){
        System.out.println("move move");
    }
}
