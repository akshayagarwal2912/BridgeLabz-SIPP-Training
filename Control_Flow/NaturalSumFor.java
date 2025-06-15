import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Compare both results
            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("Something went wrong in the calculations.");
            }
        }
    }
}
