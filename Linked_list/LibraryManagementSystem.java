import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    Book prev, next;

    public Book(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.prev = this.next = null;
    }
}

public class LibraryManagementSystem {
    private Book head, tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        Book newBook = new Book(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        Book newBook = new Book(title, author, genre, bookId, available);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean available) {
        if (pos <= 1) {
            addAtBeginning(title, author, genre, bookId, available);
            return;
        }
        Book temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, available);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, available);
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

    public void removeByBookId(int bookId) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByTitleOrAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search by 1. Title or 2. Author? Enter 1 or 2: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1) {
            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            Book temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    System.out.println(temp.title + ", " + temp.author + ", " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.available);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("No books found with this title.");
        } else if (ch == 2) {
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            Book temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.author.equalsIgnoreCase(author)) {
                    System.out.println(temp.title + ", " + temp.author + ", " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.available);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("No books found for this author.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public boolean updateAvailability(int bookId, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = available;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void displayForward() {
        Book temp = head;
        if (temp == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Title\tAuthor\tGenre\tID\tAvailable");
        while (temp != null) {
            System.out.println(temp.title + "\t" + temp.author + "\t" + temp.genre + "\t" + temp.bookId + "\t" + temp.available);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Book temp = tail;
        if (temp == null) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Title\tAuthor\tGenre\tID\tAvailable");
        while (temp != null) {
            System.out.println(temp.title + "\t" + temp.author + "\t" + temp.genre + "\t" + temp.bookId + "\t" + temp.available);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Book ID");
            System.out.println("5. Search by Title or Author");
            System.out.println("6. Update Availability");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Count Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Available (true/false): ");
                    boolean available = sc.nextBoolean();
                    if (choice == 1) lms.addAtBeginning(title, author, genre, id, available);
                    else if (choice == 2) lms.addAtEnd(title, author, genre, id, available);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        lms.addAtPosition(pos, title, author, genre, id, available);
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    int remId = sc.nextInt();
                    lms.removeByBookId(remId);
                    break;
                case 5:
                    lms.searchByTitleOrAuthor();
                    break;
                case 6:
                    System.out.print("Enter Book ID to update: ");
                    int upId = sc.nextInt();
                    System.out.print("Available (true/false): ");
                    boolean avail = sc.nextBoolean();
                    if (lms.updateAvailability(upId, avail)) System.out.println("Availability updated.");
                    else System.out.println("Book not found.");
                    break;
                case 7:
                    lms.displayForward();
                    break;
                case 8:
                    lms.displayReverse();
                    break;
                case 9:
                    System.out.println("Total number of books: " + lms.countBooks());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}