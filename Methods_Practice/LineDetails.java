import java.util.*;

public class LineDetails {

    // Method to calculate Euclidean distance
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and y-intercept
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;          // y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input 2 points
        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();

        // distance
        double dist = getDistance(x1, y1, x2, y2);
        System.out.println("Distance: " + dist);

        // line equation
        double[] line = getLineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m): " + line[0]);
        System.out.println("Y-Intercept (b): " + line[1]);
    }
}

