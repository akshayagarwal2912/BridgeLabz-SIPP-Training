import java.util.Scanner;

public class BMICalculatorMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for weight in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        // Take input for height in centimeters
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height in meters)^2
        double bmi = weight / (heightM * heightM);

        // Print the calculated BMI rounded to 2 decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine the status based on BMI range
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
