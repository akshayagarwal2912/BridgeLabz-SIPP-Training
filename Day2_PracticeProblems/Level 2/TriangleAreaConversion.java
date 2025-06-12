import java.util.Scanner;

public class TriangleAreaConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area_cm = 0.5 * base * height;
        double area_inch = area_cm / (2.54 * 2.54);
        System.out.println("Area in square inches: " + area_inch);
        System.out.println("Area in square cm: " + area_cm);
    }
}
