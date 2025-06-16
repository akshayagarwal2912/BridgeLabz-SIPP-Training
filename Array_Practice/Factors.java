import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements to be checked:");
        int n = scn.nextInt();

        int[] arr = new int[n];
        int[] evenArr = new int[n];
        int[] oddArr = new int[n];

        // Take input for the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Separate even and odd elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[i] = arr[i];
                System.out.println("Even element at index " + i + " is " + evenArr[i]);
            } else {
                oddArr[i] = arr[i];
                System.out.println("Odd element at index " + i + " is " + oddArr[i]);
            }
        }
    }
}
