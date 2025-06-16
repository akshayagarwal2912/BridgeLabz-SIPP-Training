import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        // Count digits
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

        // Frequency array for digits 0–9
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
