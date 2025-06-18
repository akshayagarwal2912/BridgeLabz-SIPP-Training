import java.util.*;

public class RandomStats {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates a number between 1000 and 9999
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    // Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / (double) numbers.length;

        // [average, min, max]
        return new double[] { avg, min, max };
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print generated numbers
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
