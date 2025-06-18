import java.util.*;

public class FootballTeam {

    // Method to generate random heights between 150 and 250
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }
        return heights;
    }

    // Method to calculate sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean
    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find tallest height
    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        // display all heights
        System.out.println("Player Heights: " + Arrays.toString(heights));

        System.out.println("Shortest Height: " + getShortest(heights) + " cm");
        System.out.println("Tallest Height: " + getTallest(heights) + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", getMean(heights)) + " cm");
    }
}
