// Program to convert feet to yards and miles
import java.util.*;

class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        // Convert to yards
        double yards = distanceFeet / 3;

        // Convert to miles
        double miles = yards / 1760;

        // Display results
        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);
    }
}