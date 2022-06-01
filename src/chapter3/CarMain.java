package chapter3;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the model of your car: ");
        String model = in.nextLine();
        System.out.println("Enter the year of your car: ");
        int year = in.nextInt();
        System.out.println("Enter the price of your car: ");
        double price = in.nextDouble();
        System.out.println("enter discount given: ");
        int discount = in.nextInt();

        Car car = new Car(model,year,price);
        car.setModel(model);
        car.setPrice(price);
        car.setYear(year);
        car.setDiscount(discount);
        System.out.println(car);
    }
}
