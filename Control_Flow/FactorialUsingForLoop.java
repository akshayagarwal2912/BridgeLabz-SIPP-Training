import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int fact = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            // Print the result
            System.out.println("The factorial of " + num + " is " + fact);
        }
    }
}
