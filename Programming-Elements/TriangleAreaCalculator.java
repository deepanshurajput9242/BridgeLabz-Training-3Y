// Program to calculate the area of a triangle
import java.util.*;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaSqInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaSqCm = areaSqInches * 6.4516;

        // Display results
        System.out.println("The area of the triangle is " + areaSqInches + " square inches and " + areaSqCm + " square centimeters");
    }
}