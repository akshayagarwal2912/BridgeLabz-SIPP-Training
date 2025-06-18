import java.util.*;

public class NumberChecker {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Compare two numbers: 1 = greater, 0 = equal, -1 = less
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println("Number " + arr[i] + " is Positive and Even");
                } else {
                    System.out.println("Number " + arr[i] + " is Positive and Odd");
                }
            } else {
                System.out.println("Number " + arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 0) {
            System.out.println("First and Last elements are Equal");
        } else if (result == 1) {
            System.out.println("First element is Greater than Last");
        } else {
            System.out.println("First element is Less than Last");
        }
    }
}
