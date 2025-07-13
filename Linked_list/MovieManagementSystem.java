import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

public class MovieManagementSystem {
    private Movie head, tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        newMovie.next = temp.next;
        newMovie.prev = temp;
        temp.next.prev = newMovie;
        temp.next = newMovie;
    }

    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByDirectorOrRating() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search by 1. Director or 2. Rating? Enter 1 or 2: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1) {
            System.out.print("Enter Director: ");
            String dir = sc.nextLine();
            Movie temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.director.equalsIgnoreCase(dir)) {
                    System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("No movies found for this director.");
        } else if (ch == 2) {
            System.out.print("Enter Rating: ");
            double rate = sc.nextDouble();
            Movie temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.rating == rate) {
                    System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("No movies found with this rating.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void displayForward() {
        Movie temp = head;
        if (temp == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Title\tDirector\tYear\tRating");
        while (temp != null) {
            System.out.println(temp.title + "\t" + temp.director + "\t" + temp.year + "\t" + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Movie temp = tail;
        if (temp == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Title\tDirector\tYear\tRating");
        while (temp != null) {
            System.out.println(temp.title + "\t" + temp.director + "\t" + temp.year + "\t" + temp.rating);
            temp = temp.prev;
        }
    }

    public boolean updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director or Rating");
            System.out.println("6. Display Forward");
            System.out.println("7. Display Reverse");
            System.out.println("8. Update Rating");
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
                    System.out.print("Director: ");
                    String director = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    if (choice == 1) mms.addAtBeginning(title, director, year, rating);
                    else if (choice == 2) mms.addAtEnd(title, director, year, rating);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        mms.addAtPosition(pos, title, director, year, rating);
                    }
                    break;
                case 4:
                    System.out.print("Enter Title to remove: ");
                    String remTitle = sc.nextLine();
                    mms.removeByTitle(remTitle);
                    break;
                case 5:
                    mms.searchByDirectorOrRating();
                    break;
                case 6:
                    mms.displayForward();
                    break;
                case 7:
                    mms.displayReverse();
                    break;
                case 8:
                    System.out.print("Enter Title to update rating: ");
                    String upTitle = sc.nextLine();
                    System.out.print("Enter new rating: ");
                    double newRating = sc.nextDouble();
                    if (mms.updateRating(upTitle, newRating)) {
                        System.out.println("Rating updated.");
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid  choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}