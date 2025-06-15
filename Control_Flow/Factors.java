import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            int counter = 1; // Start from 1

            System.out.println("Factors of " + number + " are:");

            // Run loop from 1 to number
            while (counter <= number) {
                // If number is divisible by counter, it's a factor
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // Move to next number
            }

        } else {
            // If number is not positive
            System.out.println("Please enter a positive integer.");
        }
    }
}
