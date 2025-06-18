import java.util.*;

public class ZaraBonusCalculator {

    // Method to generate employee data: [salary, years]
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(11); // 1 to 11 years of service
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // Method to calculate bonus and new salary: [oldSalary, years, bonus, newSalary]
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    // Method to display the result and totals
    public static void displayResults(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("Emp-%02d\t\t%.2f\t%.0f\t%.2f\t%.2f\n",
                (i + 1),
                result[i][0],
                result[i][1],
                result[i][2],
                result[i][3]);

            totalOld += result[i][0];
            totalBonus += result[i][2];
            totalNew += result[i][3];
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t\t%.2f\t\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] result = calculateBonus(employeeData);
        displayResults(result);
    }
}
