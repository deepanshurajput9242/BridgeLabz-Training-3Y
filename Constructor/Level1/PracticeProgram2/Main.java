package PracticeProgram2;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.display();

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
