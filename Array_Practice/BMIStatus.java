import java.util.*;
//temp comment
public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for height and weight and calculating BMI
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height in meters for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);  // BMI formula

            // Assigning weight status based on BMI value
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Displaying the final details
        System.out.println("\nPerson Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] + " m, Weight = " + weight[i] + " kg, BMI = " + String.format("%.2f", bmi[i]) + ", Status = " + status[i]);
        }
    }
}
