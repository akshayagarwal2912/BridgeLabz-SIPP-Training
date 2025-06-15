import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se number input lo
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Greatest factor ko 1 se start karo
        int greatestFactor = 1;

        // Counter ko number - 1 se start karo
        int counter = number - 1;

        // Jab tak counter 1 tak aaye tab tak loop chalao
        while (counter >= 1) {
            // Agar number counter se divide ho jaye
            if (number % counter == 0) {
                // Toh greatest factor mil gaya
                greatestFactor = counter;
                break;
            }
            // Counter ko kam karte jao
            counter--;
        }

        // Result print karo
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}
