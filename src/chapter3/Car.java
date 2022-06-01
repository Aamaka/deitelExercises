package chapter3;

public class Car {
    private boolean isOn;
    private String model;
    private int year;
    private double price;

    public Car(String model,int year,double price){
     this.model = model;
     this.year = year;
     this.price = price;

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


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }else{
            this.price = 0;
        }

    }



    public void setDiscount(int discount) {
        this.price = discount * price / 100;
    }


    public double getPrice() {
        return price;
    }

    public String toString(){
        return "price :" + price+ "\n"+
                "Model: " + model+ "\n"+
                "year: " + year;
    }
}

