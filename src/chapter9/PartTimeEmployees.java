package chapter9;

public class PartTimeEmployees extends Employee{
    private double hourPay;

    public PartTimeEmployees(String firstName, String lastName, String id, int salary, String dateOfBirth, double hourPay) {
        super(firstName, lastName, id, salary, dateOfBirth);
        this.hourPay = hourPay;
    }
    public double getHourPay() {
        return hourPay;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }

   public  double calculateWeeklyPay(int numberOfHours){
     return hourPay * numberOfHours;
   }
}
