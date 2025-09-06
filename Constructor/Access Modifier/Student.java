package JassiQuestion1;

public class Student {
    // Access Modifiers
    public int rollNumber;      // Public: Accessible everywhere
    protected String name;      // Protected: Accessible in same package & subclasses
    private double cgpa;        // Private: Accessible only inside this class

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA (since CGPA is private)
    public double getCGPA() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0 and 10.");
        }
    }

    // Public method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }
}

