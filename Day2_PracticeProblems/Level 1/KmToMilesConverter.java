import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable km of type double
        double km;
        
        // Prompt user to enter distance in km
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        
        // Convert km to miles using the formula: 1 mile = 1.6 km
        double miles = km / 1.6;
        
        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the scanner
        input.close();
    }
}