import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the starting number for countdown
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        // Countdown from counter to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Final message after countdown
        System.out.println("Launch!");
    }
}
