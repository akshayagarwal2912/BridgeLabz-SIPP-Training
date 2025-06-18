import java.util.Scanner;

public class CalendarDisplay {

    // Month names
    static final String[] MONTHS = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month
    static final int[] DAYS = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Get number of days in the month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return DAYS[month];
    }

    // Get first day of the month using Zeller’s congruence
    public static int getStartDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int q = 1;
        int k = year % 100;
        int j = year / 100;
        int h = (q + 13*(month + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        int d = ((h + 6) % 7); // Adjusting to make Sunday = 0
        return d;
    }

    // Print calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n\t" + MONTHS[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        // Initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}
