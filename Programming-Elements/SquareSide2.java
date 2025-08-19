// Program to find the side of a square given the perimeter
import java.util.*;

class SquareSide2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}