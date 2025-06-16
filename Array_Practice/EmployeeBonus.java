import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input for salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double s = sc.nextDouble();
            double y = sc.nextDouble();

            if (s < 0 || y < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salary[i] = s;
            service[i] = y;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying totals
        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
