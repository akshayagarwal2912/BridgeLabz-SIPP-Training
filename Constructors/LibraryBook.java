class Book {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor to initialize book details
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Method to display book details
    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 299.0, true);

        System.out.println("Before borrowing:");
        b1.showDetails();

        System.out.println("\nAttempt to borrow:");
        b1.borrowBook();

        System.out.println("\nAfter borrowing:");
        b1.showDetails();
    }
}
