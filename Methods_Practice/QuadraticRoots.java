import java.util.*;

public class QuadraticRoots {

    // Method to find roots of quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots;

        if (delta > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2.0 * a);
        } else {
            roots = new double[0]; // No real roots
        }

        return roots;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a, b, c
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double[] result = findRoots(a, b, c);

        // Printing roots
        if (result.length == 2) {
            System.out.println("Two roots: " + result[0] + " and " + result[1]);
        } else if (result.length == 1) {
            System.out.println("One root: " + result[0]);
        } else {
            System.out.println("No real roots");
        }
    }
}
