package chapter3;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = in.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.println("Enter year of birth: ");
        int yearOfBirth = in.nextInt();
        System.out.println("Enter year:");
        int year = in.nextInt();
        System.out.println("Enter month: ");
        int month = in.nextInt();
        System.out.println("Enter day: ");
        int day = in.nextInt();

        HeartRate myHeart = new HeartRate(firstName,lastName,yearOfBirth,year,month,day);
        System.out.println(myHeart);
    }
}
