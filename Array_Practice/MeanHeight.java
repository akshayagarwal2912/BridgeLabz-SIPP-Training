import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = new int[11];  // Array to store heights of 11 players
        int sum = 0;

        // Input heights and calculate sum
        for(int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            height[i] = sc.nextInt();
            sum += height[i];
        }

        int mean = sum / 11;  // Integer division for mean height

        System.out.println("\nMean height of the football team: " + mean);
    }
}
