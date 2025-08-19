// Program to calculate discounted fee using user input
import java.util.*;

class UniversityFeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculate final fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);
    }
}