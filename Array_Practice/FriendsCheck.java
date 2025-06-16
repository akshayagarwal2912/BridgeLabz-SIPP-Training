import java.util.*;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Taking age and height input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height of " + names[i] + ":");
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        // Finding index of youngest and tallest
        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        // Display result
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}
