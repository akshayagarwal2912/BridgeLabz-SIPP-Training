import java.util.*;

public class BMICalculator {

    // Method to calculate BMI and store it in the 3rd column of the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // Store BMI in 3rd column
        }
    }

    // Method to determine BMI status based on BMI values
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // [weight, height(cm), bmi]

        // Input weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height in cm
        }

        calculateBMI(data);
        String[] bmiStatus = determineBMIStatus(data);

        // Output the results
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    i + 1, data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }
    }
}
