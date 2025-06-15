import java.util.Scanner;

public class FizzBuzzAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            int i = 1;

            // Loop from 1 to the entered number
            while (i <= number) {
                // If divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // If divisible by 3 only
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // If divisible by 5 only
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If not divisible by 3 or 5
                else {
                    System.out.println(i);
                }

                // Move to the next number
                i++;
            }
        } else {
            // If input is not positive
            System.out.println("Please enter a positive integer.");
        }
    }
}
