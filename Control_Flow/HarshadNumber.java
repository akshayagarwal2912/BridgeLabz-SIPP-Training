import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;               // To store sum of digits
        int original = number;     // Store original number for checking later

        // Extract each digit and calculate sum of digits
        while (number > 0) {
            int digit = number % 10;   // Get last digit
            sum += digit;             // Add digit to sum
            number /= 10;             // Remove last digit
        }

        // Check if original number is divisible by sum of its digits
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is Not a Harshad Number.");
        }
    }
}
