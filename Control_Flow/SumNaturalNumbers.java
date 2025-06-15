import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Number");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) {            // Using a while loop to calculate the sum
            sum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;          // Using the formula for the sum of the first n natural numbers

        System.out.println("Sum using loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        if (sum == formulaSum)          // Comparing both results
            System.out.println("Equal Results");
        else
            System.out.println("Unequal Results");// temporary change to test the code
    }
}
