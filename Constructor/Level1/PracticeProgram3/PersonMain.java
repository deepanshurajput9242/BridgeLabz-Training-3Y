package PracticeProgram3;

public class Main {
    public static void main(String[] args) {
        // Create Person using parameterized constructor
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        p1.display();

        System.out.println();

        // Create Person using copy constructor
        Person p2 = new Person(p1);
        System.out.println("Cloned Person:");
        p2.display();
    }
}
