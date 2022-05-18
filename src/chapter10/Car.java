package chapter10;

public class Car implements CarbonFootPrint {
    private String model;
    private int length;

    public Car(String model, int length) {
        this.model = model;
        this.length = length;
    }
    @Override
    public void getCarbonFootPrint() {
        System.out.println("i dont know how to solve it");
    }
}
