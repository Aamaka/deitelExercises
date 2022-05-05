package personalFun;

public class Bag {
    private int size;
    private String colour;
    private String type;
    private String design;
    private  String model;

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getDesign() {
        return design;
    }

    public String getModel() {
        return model;
    }

    public Bag(int size, String colour, String type, String design, String model) {
        this.size = size;
        this.colour = colour;
        this.type = type;
        this.design = design;
        this.model = model;

    }
}
