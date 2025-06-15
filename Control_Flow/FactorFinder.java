import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number - 1
            for (int i = 1; i < number; i++) {
                // Check if i divides number completely
                if (number % i == 0) {
                    System.out.println(i);  // Print the factor
                }
            }

        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
