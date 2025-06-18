import java.util.*;

public class NaturalNumberSum {

    // Recursive method to calculate sum of natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method to calculate sum
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input: not a natural number");
            return;
        }

        int sum1 = sumRecursive(n);
        int sum2 = sumFormula(n);

        System.out.println("Recursive Sum: " + sum1);
        System.out.println("Formula Sum: " + sum2);

        if (sum1 == sum2) {
            System.out.println("Both results match.");
        } else {
            System.out.println("Mismatch in results.");
        }
    }
}
