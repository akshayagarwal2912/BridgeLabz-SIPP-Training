import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Convert centimeters to inches
        double heightInInches = heightInCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (heightInInches / 12);
        double inches = heightInInches % 12;

        // Display the results
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightInCm, feet, inches);
        
        scanner.close();
    }
}