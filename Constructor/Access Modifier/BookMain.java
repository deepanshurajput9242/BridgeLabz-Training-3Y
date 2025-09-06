package JassiQuestion3;

public class Main {
    public static void main(String[] args) {
        // Creating a Book object
        Book b1 = new Book("ISBN12345", "Java Programming", "James Gosling");
        b1.displayBookDetails();

        // Update author using setter
        b1.setAuthor("Updated Author");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        // Creating an EBook object
        EBook eb1 = new EBook("ISBN54321", "Advanced Java", "John Doe", 5.2);
        eb1.displayEBookDetails();

        // Modify author of eBook
        eb1.setAuthor("Updated EBook Author");
        System.out.println("After Author Update:");
        eb1.displayEBookDetails();
    }
}
