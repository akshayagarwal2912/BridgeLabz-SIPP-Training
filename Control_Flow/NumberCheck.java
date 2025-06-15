import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // Check if the number is negative
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // If not positive or negative, then it's zero
        else {
            System.out.println("The number is zero.");
        }
    }
}
