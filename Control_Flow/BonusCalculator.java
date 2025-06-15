import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Take years of service input
        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        // Check if service is more than 5 years
        if (years > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("You get a bonus of: " + bonus);
        } else {
            System.out.println("No bonus. Service must be more than 5 years.");
        }
    }
}
