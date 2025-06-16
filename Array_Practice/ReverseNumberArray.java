import java.util.*;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        // Count number of digits
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Reverse the digits array into a new array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Display the reversed digits
        System.out.println("\nDigits in reverse order:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
    }
}
