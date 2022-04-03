package tddClass;

public class HeartRate {
    private String firstName;
    private String lastName;
    private  String yearOfBirth;
    private  String year;
    private  String month;
    private  String day;
    int age;
    private String dateOfBirth;


    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public  HeartRate(String firstName, String lastName, String yearOfBirth, String year, String month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.year = year;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//
//
//    public void setFirstName(String firstName) {
//      this.firstName = firstName;
//    }
//
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public  String getLastName(){
//        return  lastName;
//    }
//
//    public void setBirthYear( int year) {
//        this.yearOfBirth = year;
//    }
//
//    public void setYear(int yearOfBirth) {
//        this.year = yearOfBirth;
//    }
//
//    public int getYear() {
//        return  year;
//
//    }
//
//    public int getAge(){
//        return  year - yearOfBirth;
//    }
//
//    public int getBirthYear() {
//        return yearOfBirth;
//    }
//
//    public int getMaximumHeartRate(int age) {
//        return 220 - age;
//    }

//    public int getTarget() {
//        return 85 * 220 - age /100;
//    }
//
//    public void setMonth(String month) {
//        this.month = month;
//    }
//
//    public  String getMonth(){
//        return  month;
//    }
//
//    public  void setDay(int day){
//        this.day = day;
//    }
//
//    public  int getDay (){
//        return  day;
//    }
//
//
//    public int getDateOfBirth() {
//        return dateOfBirth;
//    }

    public void setDateOfBirth(String month,String day, String yearOfBirth) {
       dateOfBirth = month+  day+  yearOfBirth;
    }

    public void setBirthYear(String birthYear) {
        this.yearOfBirth = birthYear;
    }

    public String getBirthYear() {
        return yearOfBirth;
    }


    public int getMaximumHeartRate(int age) {
        return 220-age;
    }

    public int getTarget() {
        return  85 * 220 - age /100;

    }
}

