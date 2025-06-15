import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check if the number is valid
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");

            // Loop from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
    }
}
