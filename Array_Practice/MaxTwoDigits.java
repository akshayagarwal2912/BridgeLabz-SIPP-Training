import java.util.*;

public class MaxTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxSize = 10;
        int[] digits = new int[maxSize];
        int idx = 0;

        // Extract digits and store in array
        while (num != 0) {
            if (idx == maxSize) {
                maxSize += 5;
                int[] temp = new int[maxSize];
                for (int j = 0; j < idx; j++) {
                    temp[j] = digits[j];
                }
                digits = temp; // update to larger array
            }
            digits[idx++] = num % 10;
            num /= 10;
        }

        int max = 0, secondMax = 0;

        // Find largest and second largest digit
        for (int i = 0; i < idx; i++) {
            if (digits[i] > max) {
                secondMax = max;
                max = digits[i];
            } else if (digits[i] > secondMax && digits[i] != max) {
                secondMax = digits[i];
            }
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Second largest digit: " + secondMax);
    }
}
