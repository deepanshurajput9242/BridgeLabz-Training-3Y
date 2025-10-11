package PracticeLucky2;

public class Course {
    // Instance Variables
    private String courseName;
    private int duration;   // duration in months
    private double fee;

    // Class Variable (common for all courses)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("-----------------------------");
    }

    // Class Method (Static) → to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
