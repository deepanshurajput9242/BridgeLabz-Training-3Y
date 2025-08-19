// Program to perform integer operations and show operator precedence
import java.util.*;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display results
        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 +
                ", and " + result4);
    }
}