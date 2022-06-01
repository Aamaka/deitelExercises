package eStore;

public class HomeAddress {
    String cityName;
    String countryName;
    int houseNumber;
    String street;
    String state;

    public HomeAddress(String cityName, String countryName, int houseNumber, String street, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
}
