package chapter3;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int year;
    private int birthYear;
    private int month;
    private int day;

    public HeartRate(String firstName, String lastName, int yearOfBirth, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName =  lastName;
        this.birthYear = yearOfBirth;
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public void setFirstName(String myFirstName) {
        firstName = myFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String myLastName) {
        lastName = myLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYear(int thisYear) {
        year = thisYear;
    }

    public int getYear() {
        return year;
    }

    public void setBirthYear(int myBirthYear) {
        birthYear = myBirthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public int getAge() {
        return year - birthYear;
    }

    public int getMaximumHeartRate() {

        return 220 - (year - birthYear);
    }

    public int getTarget() {
        return 85 * getMaximumHeartRate() / 100;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        if (month <= 12) {
            switch (month) {
                case 1 -> System.out.println("January");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("March");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("May");
                case 6 -> System.out.println("June");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("August");
                case 9 -> System.out.println("September");
                case 10 -> System.out.println("October");
                case 11 -> System.out.println("November");
                case 12 -> System.out.println("December");
                default -> System.out.println("enter only numbers from 1 to 12 ");
            }

            return month;
        }
        return month;
    }

    public String getDateOfBirth() {
        return month + "/" + day + "/" + birthYear;


    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getDay(){
        return  day;
    }

    @Override
    public String toString() {
        return "HeartRate{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", birthYear=" + birthYear +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}