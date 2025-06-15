import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int sum = 0; // To store sum of proper divisors

        // Loop to find and sum the divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;  // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}
