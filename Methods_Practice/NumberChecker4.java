public class NumberChecker4 {

    // Method to count digits
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits into an array
    public static int[] getDigitsArray(int num) {
        int[] digits = new int[countDigits(num)];
        int i = digits.length - 1;
        while (num > 0) {
            digits[i--] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to get sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to get sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2); // or Math.pow(d, 2.0)
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to calculate frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit][0] = digit, [digit][1] = count
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // first column = digit
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 243; // change this for testing
        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + isHarshad(num, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit: " + freq[i][0] + " -> Count: " + freq[i][1]);
            }
        }
    }
}
