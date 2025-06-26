// BookRecord.java

class BookRecord {
    public String ISBN;         // public
    protected String title;     // protected
    private String author;      // private

    // Constructor
    public BookRecord(String isbn, String bookTitle, String bookAuthor) {
        ISBN = isbn;
        title = bookTitle;
        author = bookAuthor;
    }

    // Setter for author
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Display book details
    public void showDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access to ISBN (public) and title (protected)
class EBook extends BookRecord {

    // Constructor
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    // Display eBook basic details
    public void showEBookInfo() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
    }
}

// Main class
public class BookLibrary {
    public static void main(String[] args) {
        BookRecord b1 = new BookRecord("123-XYZ", "Java Basics", "John Doe");
        b1.showDetails();

        System.out.println();

        EBook ebook = new EBook("456-ABC", "Advanced Java", "Jane Smith");
        ebook.showEBookInfo();

        ebook.setAuthor("New Author");
        System.out.println("Updated Author (via getter): " + ebook.getAuthor());
    }
}
