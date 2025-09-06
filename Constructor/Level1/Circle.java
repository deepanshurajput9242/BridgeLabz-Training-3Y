package PracticeProgram2;

public class Circle {
    private double radius;

    // Default constructor (calls parameterized constructor with default value)
    public Circle() {
        this(1.0);  // Constructor chaining
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterized constructor called with radius: " + radius);
    }

    // Method to display radius
    public void display() {
        System.out.println("Radius of circle: " + radius);
    }
}
