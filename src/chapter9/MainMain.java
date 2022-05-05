package chapter9;

public class MainMain {
    public static void main(String[] args) {
        CommissionEmployee employ = new CommissionEmployee("bay","gee","23456",45.6,12.5);
        BasePlus base = new BasePlus("bae","jor","2345",22.4,13.4,3000);
        Salary alert = new Salary(employ,base);
        alert.getCommission().setFirstName("adeola");
        System.out.println(alert.getCommission().getFirstName());
    }
}
