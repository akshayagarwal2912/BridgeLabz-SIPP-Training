public class NumberChecker6 {

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    // Check if number is perfect
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Check if number is abundant
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Check if number is deficient
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Factorial helper
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Check if number is strong number
    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 145;

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
