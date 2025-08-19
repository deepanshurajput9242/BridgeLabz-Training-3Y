// Program to convert distance from feet to yards and miles
import java.util.*;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        // Convert to yards and miles
        double yards = distanceFeet / 3;
        double miles = yards / 1760;

        // Display results
        System.out.println("The distance is " + yards + " yards and " + miles + " miles for the given " + distanceFeet + " feet");
    }
}