package chapter9;

public class BasePlus {

    private String firstName;
    private String lastName;
    private String socialSecurity;
    private double noOfGrossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlus(String firstName, String lastName, String socialSecurity, double noOfGrossSales, double commissionRate, int baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.noOfGrossSales = noOfGrossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setNoOfGrossSales(double noOfGrossSales) {
        if(noOfGrossSales < 0.0) throw  new IllegalArgumentException("gross sales must be > 0.0");
        this.noOfGrossSales = noOfGrossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0) throw  new IllegalArgumentException("commission rate must be > 0.0");
        this.commissionRate = commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) throw  new IllegalArgumentException("base salary must be > 0.0");
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public double getNoOfGrossSales() {
        return noOfGrossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings(){
        return (getBaseSalary() + getNoOfGrossSales())* getCommissionRate();
    }

}
