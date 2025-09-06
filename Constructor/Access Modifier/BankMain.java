package JassiQuestion2;

public class MainClass {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount sa = new SavingsAccount(101, "Deepanshu", 5000, 5.0);

        // Show account info
        sa.displayAccountInfo();

        // Perform transactions
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.addInterest();

        // Final details
        System.out.println("\nAfter Transactions:");
        sa.displayAccountInfo();
    }
}
