package JassiQuestion1;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student(101, "Amit Kumar", 8.5);
        s1.displayStudentDetails();

        // Modifying CGPA using setter
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Priya Sharma", 9.0, "Computer Science");
        pg1.displayPGStudentDetails();

        // Demonstrating CGPA update in subclass
        pg1.setCGPA(9.5);
        System.out.println("After CGPA Update:");
        pg1.displayPGStudentDetails();
    }
}
