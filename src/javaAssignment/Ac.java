package javaAssignment;

public class Ac {
    private boolean isOn;
    private int temperature;
     public Ac () {
    temperature = 16;
}

    public void switchOnOff() {
         isOn = !isOn;
        }

    public boolean isOnOff() {
        return isOn;
    }

    public void increaseTemperature() {
        if(temperature < 30){temperature ++;}
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
        {temperature = temperature - 1;}
    }

}
