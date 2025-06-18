import java.util.Arrays;

public class NumberChecker5 {

    // Method to count number of digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits into an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

    // Method to check palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        int num = 1201;

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseArray(di
