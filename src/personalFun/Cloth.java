package personalFun;

public class Cloth {
    private int size;
    private String design;
    private String colour;
    private int length;
    private String type;

    public Cloth(int size, String design, String colour, int length, String type) {
        this.size = size;
        this.design = design;
        this.colour = colour;
        this.length = length;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getDesign() {
        return design;
    }

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }
}
