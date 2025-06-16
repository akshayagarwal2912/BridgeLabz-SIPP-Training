import java.util.*;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] result = new int[4];  // To store multiplication results from 6 to 9

        // Calculate and store results
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = num * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication table of " + num + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + result[i - 6]);
        }
    }
}
