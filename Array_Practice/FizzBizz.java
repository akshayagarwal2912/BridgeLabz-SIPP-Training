import java.util.*;
public class FizzBizz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {// Loop through the array to get user input
            System.out.println("Enter element " + (i + 1) + ": ");      //
            arr[i] = scn.nextInt();
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {// Check if the number is divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (arr[i] % 3 == 0) {// 
                System.out.println("Fizz");
            } else if (arr[i] % 5 == 0) {// Check if the number is divisible by 5
                System.out.println("Buzz");
            } else {
                System.out.println("Element at Index " + i + " is " + arr[i]);
            }
        }
    }
}
