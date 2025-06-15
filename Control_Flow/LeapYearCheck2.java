import java.util.Scanner;

public class LeapYearCheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar and leap year in a single condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
