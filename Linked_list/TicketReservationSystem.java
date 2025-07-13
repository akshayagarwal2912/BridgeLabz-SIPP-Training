import java.util.Scanner;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class TicketReservationSystem {
    private Ticket head = null;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
            return;
        }
        Ticket temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newTicket;
        newTicket.next = head;
    }

    public void removeByTicketId(int ticketId) {
        if (head == null) return;
        if (head.ticketId == ticketId && head.next == head) {
            head = null;
            return;
        }
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (temp == head) {
                    Ticket last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        System.out.println("ID\tCustomer\tMovie\tSeat\tBookingTime");
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + "\t" + temp.customerName + "\t" + temp.movieName + "\t" + temp.seatNumber + "\t" + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomerOrMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search by 1. Customer Name or 2. Movie Name? Enter 1 or 2: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch == 1) {
            System.out.print("Enter Customer Name: ");
            String cname = sc.nextLine();
            Ticket temp = head;
            boolean found = false;
            if (head == null) return;
            do {
                if (temp.customerName.equalsIgnoreCase(cname)) {
                    System.out.println(temp.ticketId + ", " + temp.customerName + ", " + temp.movieName + ", " + temp.seatNumber + ", " + temp.bookingTime);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
            if (!found) System.out.println("No ticket found for this customer.");
        } else if (ch == 2) {
            System.out.print("Enter Movie Name: ");
            String mname = sc.nextLine();
            Ticket temp = head;
            boolean found = false;
            if (head == null) return;
            do {
                if (temp.movieName.equalsIgnoreCase(mname)) {
                    System.out.println(temp.ticketId + ", " + temp.customerName + ", " + temp.movieName + ", " + temp.seatNumber + ", " + temp.bookingTime);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
            if (!found) System.out.println("No ticket found for this movie.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Ticket Reservation System ---");
            System.out.println("1. Add Ticket");
            System.out.println("2. Remove Ticket by ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search by Customer or Movie");
            System.out.println("5. Count Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Ticket ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String mname = sc.nextLine();
                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();
                    System.out.print("Booking Time: ");
                    String btime = sc.nextLine();
                    trs.addTicket(tid, cname, mname, seat, btime);
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    int remId = sc.nextInt();
                    trs.removeByTicketId(remId);
                    break;
                case 3:
                    trs.displayTickets();
                    break;
                case 4:
                    trs.searchByCustomerOrMovie();
                    break;
                case 5:
                    System.out.println("Total tickets booked: " + trs.countTickets());
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