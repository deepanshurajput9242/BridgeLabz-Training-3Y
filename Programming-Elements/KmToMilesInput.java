// Program to convert kilometers to miles using user input
import java.util.*;

class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Conversion rate
        double kmToMilesRate = 1.6;

        // Calculate miles
        double miles = kilometers / kmToMilesRate;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}