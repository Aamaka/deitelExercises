package chapter5.chapter6;

public class FloorAndCeil {
    private  double max;
    private double min;

    public void setFloor(double num1, double num2, double num3, double num4, double num5) {
        max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        if(num4 > max) max = num4;
        else max = num5;

    }

    public double getFloor() {
        return max;
    }

    public void setCeil(double num1, double num2, double num3, double num4, double num5) {
        min = num1;
        if(num2 < min) min = num2;
        else if(num3 < min) min = num3;
        else if(num4 < min) min = num4;
        else min = num5;
    }

    public double getCeil() {
        return min;
    }
}
