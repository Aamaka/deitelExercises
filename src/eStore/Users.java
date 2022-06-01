package eStore;

public class Users {
    int age;
    String emailAddress;
     HomeAddress homeAddress;
    String name;
    String password;
    String phone;

    public Users(int age, String emailAddress, HomeAddress homeAddress, String name, String password, String phone) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
}
