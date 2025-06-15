import java.util.Scanner;

public class MultiplesBelow100_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check if the number is valid
        if (number > 0 && number < 100) {
            int counter = 99; // Start just below 100

            System.out.println("Multiples of " + number + " below 100:");

            // Run the loop while counter is more than 1
            while (counter > 1) {
                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // Move to next lower number
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
    }
}
