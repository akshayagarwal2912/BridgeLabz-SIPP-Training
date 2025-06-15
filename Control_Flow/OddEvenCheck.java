import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive)
        if (number > 0) {
            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Please enter a natural (positive) number.");
        }
    }
}
