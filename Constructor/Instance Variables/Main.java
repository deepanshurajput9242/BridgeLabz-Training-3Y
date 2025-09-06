package PracticeLucky1;

public class Main {
    public static void main(String[] args) {
        // Creating Products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 25000);
        Product p3 = new Product("Headphones", 2000);

        // Displaying Product Details (Instance method)
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Displaying Total Products (Class method)
        Product.displayTotalProducts();
    }
}
