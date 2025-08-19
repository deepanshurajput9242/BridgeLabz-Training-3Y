// Program to find Harry's age in a given year
import java.util.*;

class HarryAgeFinder {
    public static void main(String[] args) {
        // Fixed variables
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}