class BookRecord {
    // Static variable shared across all BookRecord objects
    static String libraryName = "Central City Library";
    
    // Instance variables
    String title;
    String author;
    final String isbn; // Final variable to ensure ISBN cannot change

    // Constructor using 'this' to initialize instance variables
    BookRecord(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details, checking instanceof first
    void displayDetails() {
        if (this instanceof BookRecord) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("The object is not a BookRecord.");
        }
    }
}

// Main class to test the BookRecord class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display the library name using the static method
        BookRecord.displayLibraryName();
        System.out.println();

        // Create BookRecord objects
        BookRecord book1 = new BookRecord("The Alchemist", "Paulo Coelho", "ISBN-001");
        BookRecord book2 = new BookRecord("1984", "George Orwell", "ISBN-002");

        // Display details of each book
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
        System.out.println();

        // Example: Checking instanceof explicitly
        Object obj = book1;
        if (obj instanceof BookRecord) {
            System.out.println("obj is an instance of BookRecord.");
        } else {
            System.out.println("obj is NOT an instance of BookRecord.");
        }
    }
}
