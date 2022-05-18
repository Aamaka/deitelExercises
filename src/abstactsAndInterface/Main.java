package abstactsAndInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle b = new Vehicle() {
            @Override
            public void move() {
                System.out.println("move");
            }

            @Override
            public void turnRight() {
                System.out.println("right");
            }
        };
        b.move();

        Vehicle c = new Car() {
            @Override
            public void turnLeft() {
                System.out.println("left");
            }
        };
        c.turnRight();

        Vehicle  d = new Motor();
        d.turnRight();

        Car e = new Motor();
        e.move();

        Vehicle f = new Car() {
            @Override
            public void turnLeft() {
                System.out.println("left left");
            }
        };
        f.move();
    }
}
