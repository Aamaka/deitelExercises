package chapter10;

public class Bicycle implements CarbonFootPrint{
    private String size;
    public Bicycle(String size, String name) {
        this.size = size;
        this.name = name;
    }

    private String name;

    @Override
    public void getCarbonFootPrint() {
        System.out.println("i dont know how to solve it");
    }
}
