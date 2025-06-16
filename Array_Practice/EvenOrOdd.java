import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Number till to be checked");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] evenArr = new int[n];
        int[] oddArr = new int[n];
        for(int i = 0; i < n; i++){// Loop through the array to get user input
            arr[i] = i;
        }
        for(int i = 0; i < n;i++){// Check if the number is even or odd
            if(arr[i] % 2 == 0){        // Check if the number is even
                evenArr[i] = arr[i];
                System.out.println("Even element at index " + i + " is " + evenArr[i]);
            }
            else{
                oddArr[i] = arr[i];// Check if the number is odd
                System.out.println("Odde element at index " + i + "is" + oddArr[i]);
            }
        }
    }
}
