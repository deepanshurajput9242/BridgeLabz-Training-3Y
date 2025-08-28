import java.util.*;

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {
            System.out.println("Welcome to online shopping!");

            int total = 0;
            int choice;
            int quantity;

            do {
                System.out.println("\n-- Product Menu ---");
                System.out.println(" 1. Mobile ($10000)");
                System.out.println(" 2. HeadPhones ($500)");
                System.out.println(" 3. Laptop ($50000)");
                System.out.println(" 4. Mobile Cover ($30)");
                System.out.println(" 5. Exit ");

                System.out.print("Enter your choice: ");
                choice = scn.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the Quantity: ");
                        quantity = scn.nextInt();
                        total += 10000 * quantity;
                        break;
                    case 2:
                        System.out.print("Enter the Quantity: ");
                        quantity = scn.nextInt();
                        total += 500 * quantity;
                        break;
                    case 3:
                        System.out.print("Enter the Quantity: ");
                        quantity = scn.nextInt();
                        total += 50000 * quantity;
                        break;
                    case 4:
                        System.out.print("Enter the Quantity: ");
                        quantity = scn.nextInt();
                        total += 30 * quantity;
                        break;
                    case 5:
                        System.out.println("Exiting product menu...");
                        break;
                    default:
                        System.out.println("Please enter a valid Input!");
                        break;
                }
            } while (choice != 5);

            // Apply discount if total > 5000
            if (total > 5000) {
                System.out.println("Congratulations! You got 10% discount!");
                total -= (total * 10) / 100;
            }

            System.out.println("Final Bill: $" + total);

            // Ask if more customers want to shop
            System.out.print("\nIs there another customer? (yes/no): ");
            String ans = scn.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
    }
}
