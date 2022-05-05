package chapter9;

public class Salary {
    private CommissionEmployee commission;
    private BasePlus plus;

    public CommissionEmployee getCommission() {
        return commission;
    }

    public BasePlus getPlus() {
        return plus;
    }

    public Salary(CommissionEmployee commission, BasePlus plus) {
        this.commission = commission;
        this.plus = plus;
    }

    public void setCommission(CommissionEmployee commission) {
        this.commission = commission;
    }

    public void setPlus(BasePlus plus) {
        this.plus = plus;
    }

}
