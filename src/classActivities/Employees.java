package classActivities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees {
    private String firstName;
    private String lastName;
    private String id;
    private String department;
    private double salary;

    public Employees(String firstName, String lastName, String id, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


}

class Main{
    public static void main(String[] args) {
        Employees[] employees = {
                new Employees("Ada", "Emma", "AE5yu", "counselling", 45777.2),
                new Employees("Ladi", "papa", "LP345", "sanitation", 45777.2)
        };


        Map<String, List<Employees>> map = Arrays.stream(employees)
                .collect(Collectors.groupingBy(Employees::getDepartment));


        map.forEach((dept, employeeList) -> {
            System.out.printf("%s : %.2f", dept,
            employeeList.stream()
                    .mapToDouble(Employees::getSalary)
                    .sum());
            System.out.println();
        });
    }
}
