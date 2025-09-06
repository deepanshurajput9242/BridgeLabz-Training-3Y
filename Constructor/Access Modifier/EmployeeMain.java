package JassiQuestion4;

public class Main{
    public static void main(String[] args) {
        // Create a Manager object
        Manager mgr = new Manager(201, "IT", 60000, "Team Lead");

        // Show details
        mgr.displayDetails();

        // Modify salary
        mgr.setSalary(75000);

        // Final details
        System.out.println("\nAfter Salary Update:");
        mgr.displayDetails();
    }
}
