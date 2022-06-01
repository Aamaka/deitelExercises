package eStore;

public class Product {
    int productIdNumber;
    String productName;
    double price;
    String productDescription;
    ProductCategory productCategory;

    public Product(int productIdNumber, String productName, double price, String productDescription, ProductCategory productCategory) {
        this.productIdNumber = productIdNumber;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }
}
