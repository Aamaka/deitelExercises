package dependencyInjection;

public class Animal {
    private Movement movement;

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Animal(Movement move) {
        this.movement = move;
    }

    public void move(){
        System.out.println("Animal move");
    }
}
