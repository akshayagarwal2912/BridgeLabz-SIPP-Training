import java.util.Scanner;

public class PowerCalculatorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for base number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1; // Start with 1

        // Multiply number with result for power times
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
