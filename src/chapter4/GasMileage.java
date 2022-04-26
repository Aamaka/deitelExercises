package chapter4;

public class GasMileage {

    private int mile;
    private int gallon;

    public void setMile(int mile) {
        this.mile = mile;
    }

    public int getMile() {
        return mile;
    }

    public void setGallon(int gallons) {
        gallon = gallons;
    }
    public  int getGallon(){
        return gallon;
    }

    public float getMilePerGallon() {
        return (float) mile / gallon;
    }
}
