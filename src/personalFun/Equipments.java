package personalFun;

public class Equipments {
    private String name;
    private String colour;
    private int weight;
    private int length;
    private String shape;

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public String getShape() {
        return shape;
    }

    public Equipments(String name, String colour, int weight, int length, String shape) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.length = length;
        this.shape = shape;
    }

}
