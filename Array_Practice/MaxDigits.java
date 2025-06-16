import java.util.*;

public class MaxDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int i = 0;

        // Extract digits from the number
        while (num != 0) {
            digits[i] = num % 10;
            num /= 10;
            i++;
            if (i == maxDigits) break; // stop if max digits reached
        }

        int max = 0, secondMax = 0;

        // Find largest and second largest digit
        for (int j = 0; j < i; j++) {
            if (digits[j] > max) {
                secondMax = max;
                max = digits[j];
            } else if (digits[j] > secondMax && digits[j] != max) {
                secondMax = digits[j];
            }
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Second largest digit: " + secondMax);
    }
}
