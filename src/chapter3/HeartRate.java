package chapter3;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int year;
    private int birthYear;
    private int month;
    private int day;

    public HeartRate(String firstName, String hatred, int yearOfBirth, int year, int month, int day) {
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
        return 85 * (220 -(year - birthYear))/ 100;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        if (month <= 12) {
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("enter only numbers from 1 to 12 ");
                    break;
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
}