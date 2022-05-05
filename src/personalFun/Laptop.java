package personalFun;

public class Laptop {
    private String model;
    private KeyBoard keyBoard;
    private MotherBoard board;
    private int screenSize;
    private String screenType;

    public String getModel() {
        return model;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public MotherBoard getBoard() {
        return board;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public Laptop(String model, KeyBoard keyBoard, MotherBoard board, int screenSize, String screenType) {
        this.model = model;
        this.keyBoard = keyBoard;
        this.board = board;
        this.screenSize = screenSize;
        this.screenType = screenType;
    }
}
