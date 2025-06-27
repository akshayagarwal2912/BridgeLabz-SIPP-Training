import java.util.ArrayList;

// Book class with title and author
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class containing a list of Book objects
class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            b.display();
        }
        System.out.println();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        // Create independent Book objects
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create Library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Add books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book can be in another library
        lib2.addBook(b3);

        // Display books in each library
        lib1.displayBooks();
        lib2.displayBooks();
    }
}
