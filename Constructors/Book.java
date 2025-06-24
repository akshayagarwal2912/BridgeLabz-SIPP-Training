class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void showDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.showDetails();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("1984", "George Orwell", 299.99);
        b2.showDetails();
    }
}
