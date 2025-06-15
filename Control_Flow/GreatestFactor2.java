import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 1) {
            int greatestFactor = 1;

            // Loop from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // If i is a factor of number
                if (number % i == 0) {
                    greatestFactor = i;  // Save i as the greatest factor
                    break;               // Exit loop after first (largest) factor is found
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        } else {
            System.out.println("Please enter a number greater than 1.");
        }
    }
}
