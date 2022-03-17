package tddClass;

public class Ac {
    private boolean remote;
    private int temperature;
     public Ac () {
    temperature = 16;
}

    public void switchOnOff() {
        if (!remote){
            remote = true;
        } else {
            remote = false;
        }
        }

    public boolean isOnOff() {
        return remote;
    }

    public void increaseTemperature() {
        if (temperature < 30){temperature = temperature + 1;}
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
        {temperature = temperature - 1;}
    }
}
