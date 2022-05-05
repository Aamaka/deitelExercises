package personalFun;

public class Building {
    private  double length;
    private  double height;

    public Building(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0)throw new IllegalArgumentException("length must be greater than 0.0");
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0.0)throw new IllegalArgumentException("height must be greater than 0.0");
        this.height = height;
    }
}
