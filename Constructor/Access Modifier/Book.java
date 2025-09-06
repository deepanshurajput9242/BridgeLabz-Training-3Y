package JassiQuestion3;

// Base class
public class Book {
    // Access Modifiers
    public String ISBN;       // Public → accessible everywhere
    protected String title;   // Protected → accessible in same package & subclasses
    private String author;    // Private → accessible only inside this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author (private → accessed via method)
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-------------------------");
    }
}

// Subclass
class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Demonstrate accessing public & protected members
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);       // Public → directly accessible
        System.out.println("Title: " + title);     // Protected → accessible in subclass
        System.out.println("Author (via getter): " + getAuthor()); // Private → via public method
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("-------------------------");
    }
}
