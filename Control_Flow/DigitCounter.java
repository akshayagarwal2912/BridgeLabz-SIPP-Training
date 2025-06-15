import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Use absolute value to handle negative numbers
        number = Math.abs(number);

        // Initialize count variable
        int count = 0;

        // Special case for 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove the last digit
                count++;               // Increase the digit count
            }
        }

        // Print the result
        System.out.println("The number of digits is: " + count);
    }
}
