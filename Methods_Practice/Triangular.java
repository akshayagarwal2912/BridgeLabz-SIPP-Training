import java.util.*;
public class Triangular {
    public static int computeRounds(double side1, double side2, double side3){
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        int rounds = (int) Math.ceil(totalDistance / perimeter);// Calculate the number of rounds needed
        return rounds;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the sides of the Triangular park in km:");
        double side1 = scn.nextDouble();
        double side2 = scn.nextDouble();
        double side3 = scn.nextDouble();
        int rounds = computeRounds(side1, side2, side3);// Call the method to compute the number of rounds
        System.out.println("Total number of rounds to be run = " + rounds);
    }
}