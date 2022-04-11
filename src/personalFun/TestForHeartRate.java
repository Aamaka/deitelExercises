package personalFun;

import chapter3.HeartRate;

public class TestForHeartRate {
    public static void main(String[] args) {
        HeartRate myHeartRate = new HeartRate("babe", "joy", 2002, 2022, 7, 5);

        System.out.println(myHeartRate.getFirstName());

        System.out.println(myHeartRate.getLastName());

        System.out.println(myHeartRate.getBirthYear());

        System.out.println(myHeartRate.getYear());

        System.out.println(myHeartRate.getMonth());

        System.out.println(myHeartRate.getDay());

        System.out.println("my age is " + myHeartRate.getAge());

        System.out.println("you date of birth is " + myHeartRate.getDateOfBirth());

    }
}