import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num < 0) { // Check if the number is negative
            System.out.println("The number must be positive.");
        } else {
            int fact = 1;
            int i = 1;

            while (i <= num) {// Using a while loop to calculate the factorial
                fact = fact * i;// Multiply fact by i
                i++;
            }

            System.out.println("Factorial of " + num + " is " + fact);
        }

        sc.close();
    }
}
