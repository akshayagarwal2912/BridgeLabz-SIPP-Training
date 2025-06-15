import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is in Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap year checking is valid only for year 1582 or later.");
        } 
        // Check if the year is divisible by 4
        else if (year % 4 == 0) {
            // If divisible by 100, it must also be divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is Not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } 
        // If not divisible by 4, it’s not a leap year
        else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
