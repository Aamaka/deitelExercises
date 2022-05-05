package personalFun;

public class Shoe {
    private int size;
    private String colour;
    private String model;
    private String type;
    private String design;

    public Shoe(int size, String colour, String model, String type, String design) {
        this.size = size;
        this.colour = colour;
        this.model = model;
        this.type = type;
        this.design = design;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getDesign() {
        return design;
    }
}
