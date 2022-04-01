package tddClass;

public class HeartRate {
    private String firstName;
    private String lastName;
    private  int yearOfBirth;
    private  int year;
    private  String month;
    private  int day;
    int age;
    private int dateOfBirth;


    public  HeartRate(String firstName, String lastName,int yearOfBirth,int year,String month,int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.year = year;


    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public  String getLastName(){
        return  lastName;
    }

    public void setBirthYear( int year) {
        this.yearOfBirth = year;
    }

    public void setYear(int yearOfBirth) {
        this.year = yearOfBirth;
    }

    public int getYear() {
        return  year;

    }

    public int getAge(){
        return  year - yearOfBirth;
    }

    public int getBirthYear() {
        return yearOfBirth;
    }

    public int getMaximumHeartRate(int age) {
        return 220 - age;
    }

    public int getTarget() {
        return 85 * 220 - age /100;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public  String getMonth(){
        return  month;
    }

    public  void setDay(int day){
        this.day = day;
    }

    public  int getDay (){
        return  day;
    }


    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String month,int day, int yearOfBirth) {
      // dateOfBirth = month+  day+  yearOfBirth;
    }
}

