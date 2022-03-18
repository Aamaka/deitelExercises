package tddClass;

public class Car {
    private boolean isOn;
    private String model;

    public Car(boolean isOn,String model){

    }

    public Car() {
        this.model = model;

    }

    public void turnOn() {
        isOn = !isOn;
    }


    public boolean isOn() {
        return isOn;
    }

    public void setModel(String model) {
      this.model = model;
    }

    public String getModel() {
        return model;
    }



}
