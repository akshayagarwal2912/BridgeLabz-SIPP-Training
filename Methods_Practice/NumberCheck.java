import java.util.*;

public class NumberCheck {

    // Method to check number type
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int n = sc.nextInt();

        // Getting result
        int result = checkNumber(n);

        // Printing based on result
        if (result == 1) {
            System.out.println("Positive number");
        } else if (result == -1) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }
    }
}
