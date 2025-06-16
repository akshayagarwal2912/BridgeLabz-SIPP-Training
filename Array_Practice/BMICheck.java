import java.util.*;

public class BMICheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3]; // [][0] - weight, [][1] - height, [][2] - BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1) + ":");
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--;
                continue;
            }

            data[i][0] = w;
            data[i][1] = h;
            data[i][2] = w / (h * h); // BMI calculation

            // Set weight status based on BMI
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Display result
        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.2f\t%.2f\t%s\n",
                data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
