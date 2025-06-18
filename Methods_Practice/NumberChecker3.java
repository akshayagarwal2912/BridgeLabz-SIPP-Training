public class NumberChecker3 {

    // Count digits
    public static int countDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Store digits in array
    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int i = count - 1;
        while (num > 0) {
            digits[i--] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Check Armstrong number
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    // Find largest and second largest digits
    public static int[] findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    // Find smallest and second smallest digits
    public static int[] findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 153; // test number
        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(num, digits));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
