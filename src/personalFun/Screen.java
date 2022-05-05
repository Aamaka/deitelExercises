package personalFun;

public class Screen {
    private int size;
    private String resolution;
    private String type;

    public int getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public String getType() {
        return type;
    }

    public Screen(int size, String resolution, String type) {
        this.size = size;
        this.resolution = resolution;
        this.type = type;
    }
}
