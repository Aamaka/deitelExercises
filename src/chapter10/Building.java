package chapter10;

public class Building implements CarbonFootPrint{
    private int height;
    private int numberOfRooms;

    public Building(int height, int numberOfRooms) {
        this.height = height;
        this.numberOfRooms = numberOfRooms;
    }
    @Override
    public void getCarbonFootPrint() {
        System.out.println("i dont know how to solve it");
    }
}
