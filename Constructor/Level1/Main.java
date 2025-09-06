package LibraryBookSystem;

public class Main {
    public static void main(String[] args) {
        // Create books
        LibraryBookSystem b1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 299.99, true);
        LibraryBookSystem b2 = new LibraryBookSystem("Rich Dad Poor Dad", "Robert Kiyosaki", 499.50, true);

        // Display books
        b1.displayBook();
        b2.displayBook();

        // Borrow books
        b1.borrowBook();
        b1.displayBook();

        // Try borrowing again
        b1.borrowBook();
    }
}
