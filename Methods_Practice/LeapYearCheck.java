import java.util.*;

public class LeapYearCheck {

    // Method to check whether the given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Gregorian calendar starts from 1582
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
