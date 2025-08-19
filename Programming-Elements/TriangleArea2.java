// Program to calculate the area of a triangle in square inches and square centimeters
import java.util.*;

class TriangleArea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input in cm
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in square cm
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54^2 sq cm)
        double areaSqInches = areaSqCm / (2.54 * 2.54);

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaSqInches +
                " and sq cm is " + areaSqCm);
    }
}