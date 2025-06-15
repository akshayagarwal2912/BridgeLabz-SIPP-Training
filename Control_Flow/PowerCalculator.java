import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for base number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize result to 1
        int result = 1;
        int counter = 0;

        // Loop until counter reaches power
        while (counter < power) {
            result = result * number; // Multiply number with result
            counter++;                // Increase the counter
        }

        // Print the final result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
