package chapter9;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurity;
    private double noOfGrossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, double noOfGrossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.noOfGrossSales = noOfGrossSales;
        this.commissionRate = commissionRate;
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


}
