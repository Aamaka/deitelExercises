package personalFun;

public class Employee {
    private int Id;
    private String firstName;
    private String secondName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Employee(int id, String firstName, String secondName) {
        Id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
