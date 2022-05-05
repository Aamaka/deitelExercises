package chapter3;

public class HeartRecords extends HeartRate{
    public HeartRecords(String firstName, String lastName, int yearOfBirth, int year, int month, int day, String gender, double height, double weight ) {
        super(firstName, lastName, yearOfBirth, year, month, day);
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    private String gender;
    private double weight;
    private double height;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public int getBIM() {
        return (int) ((getWeight() * 703) / Math.pow(getHeight(),2));
    }
}
