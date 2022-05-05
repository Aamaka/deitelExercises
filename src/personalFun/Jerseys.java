package personalFun;

public class Jerseys {
    private int size;
    private String colour;
    private String design;
    private String name;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getDesign() {
        return design;
    }

    public Jerseys(int size, String colour, String design, String name) {
        this.size = size;
        this.colour = colour;
        this.design = design;
        this.name = name;
    }
}
