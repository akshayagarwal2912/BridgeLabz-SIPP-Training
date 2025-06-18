import java.util.*;

public class DivideNumbers {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;   // Quotient
        result[1] = number % divisor;   // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] ans = findRemainderAndQuotient(num1, num2);

        // Printing result
        System.out.println("Quotient: " + ans[0]);
        System.out.println("Remainder: " + ans[1]);
    }
}
