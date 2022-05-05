package personalFun;

public class Phone {
    private Screen screen;
    private int size;
    private String colour;
    private String camera;

    public Phone(Screen screen, int size, String colour, String camera) {
        this.screen = screen;
        this.size = size;
        this.colour = colour;
        this.camera = camera;
    }

    public Screen getScreen() {
        return screen;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getCamera() {
        return camera;
    }
}
