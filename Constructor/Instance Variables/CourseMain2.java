package PracticeLucky2;

public class Main {
    public static void main(String[] args) {
        // Updating institute name using class method
        Course.updateInstituteName("Tech Academy");

        // Creating Course objects
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Data Structures", 4, 12000);
        Course c3 = new Course("Web Development", 8, 20000);

        // Display course details (Instance method)
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        // Updating institute name again
        Course.updateInstituteName("Code Academy");

        System.out.println("After updating Institute Name:");
        c1.displayCourseDetails();
    }
}
