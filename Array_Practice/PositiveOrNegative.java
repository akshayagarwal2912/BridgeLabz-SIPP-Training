import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 elements");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) { // Loop through the array to get user input
            arr[i] = scn.nextInt();

            if (arr[i] > 0) {// Check if the number is positive
                System.out.println("Element is +ve");

                if (arr[i] % 2 == 0) {// Check if the number is even
                    System.out.println("Element is +ve and even");
                } else {
                    System.out.println("Element is +ve and odd");
                }

            } else if (arr[i] < 0) {// Check if the number is negative
                System.out.println("Element is -ve");
            } else {
                System.out.println("Element is zero");
            }
        }

        if (arr[0] > arr[4]) {// Compare first and last elements
            System.out.println("First element is bigger than last element");
        } else if (arr[0] < arr[4]) {
            System.out.println("Last element is bigger than first element");
        } else {
            System.out.println("First and last elements are equal");
        }
    }
}
