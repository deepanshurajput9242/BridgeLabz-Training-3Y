package JassiQuestion4;

// Base class
class Employee {
    public int employeeID;         // public
    protected String department;   // protected
    private double salary;         // private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: " + newSalary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
}

// Subclass
class Manager extends Employee {
    private String role;

    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Method to display details
    public void displayDetails() {
        // Accessing public and protected members
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Role: " + role);
    }
}
