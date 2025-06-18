public class FactorOperations {

    // Method to find factors of a number and return as array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static long getProductOfFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    // Method to find product of cube of factors
    public static double getProductOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) {
            prod *= Math.pow(f, 3);
        }
        return prod;
    }

    public static void main(String[] args) {
        int num = 12; // Test number
        int[] factors = getFactors(num);

        System.out.print("Factors of " + num + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + getProductOfCubes(factors));
    }
}
