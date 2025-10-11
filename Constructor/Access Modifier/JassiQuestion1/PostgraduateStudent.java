package JassiQuestion1;

// Subclass to demonstrate 'protected' access
public class PostgraduateStudent extends Student {

    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method to demonstrate access to protected member 'name'
    public void displayPGStudentDetails() {
        System.out.println("Roll Number: " + rollNumber); // public → accessible
        System.out.println("Name: " + name);               // protected → accessible in subclass
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (via getter): " + getCGPA()); // private → accessed via public method
        System.out.println("-------------------------");
    }
}

