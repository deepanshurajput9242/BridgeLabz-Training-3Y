package PracticeLucky1;

public class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable (shared across all instances)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment count whenever a new product is created
    }

    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }

    // Class Method (Static)
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
