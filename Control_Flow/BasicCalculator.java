import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Take input for the second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Take input for the operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Perform operation based on operator using switch...case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}
