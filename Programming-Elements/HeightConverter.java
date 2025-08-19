// Program to convert height from centimeters to feet and inches
import java.util.*;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double inch = heightCm / 2.54;
        int feet = (int) (inch / 12);
        double remainingInches = inch % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + remainingInches);
    }
}