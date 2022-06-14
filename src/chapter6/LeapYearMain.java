package chapter6;

import java.util.Scanner;

public class LeapYearMain {
    public static void main(String[] args) {
        user();
    }
    private static  void user(){
        LeapYear leapYear = new LeapYear();
        Scanner in = new Scanner(System.in);
        System.out.println("""
                ****************************************
                Leap Year
                ****************************************
                """);
        System.out.println("Enter the year: ");
        int year = in.nextInt();
        leapYear.setYear(year);
        System.out.println(leapYear.isLeapYear());
    }
}
