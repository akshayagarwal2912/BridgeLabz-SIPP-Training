import java.util.*;

public class SpringSeason {

    // Method to check if it's Spring Season
    public static boolean isSpring(int month, int day) {
        // Spring starts from March 20 to June 20
        if ((month == 3 && day >= 20) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and day
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Checking and printing result
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
