package chapter9;

public class Employee {

    private final String id;
    private int salary;

    private String name;

    private double discount;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String id, int salary, String dateOfBirth) {
        name = firstName + " " + lastName;
        this.id = id;
        this.salary = salary;

    }
    public void setDateOfBirth(int day, int month, int year){
        dateOfBirth = day + "/" + month + "/" + year;
    }
    public String getDateOfBirth(){
        return  dateOfBirth;
    }
    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void setName(String firstName, String lastName) {
        name = firstName + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    public int CalculateSalaryPerYear(int numberOfMonth) {
        return getSalary() * numberOfMonth;
    }
    public double getRaise(){
        return  (getDiscount() / 0.01 )* getSalary() ;
    }

}

