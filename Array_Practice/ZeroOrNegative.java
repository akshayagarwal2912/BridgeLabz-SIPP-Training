import java.util.*;

public class ZeroOrNegative {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the elements of the array (stop with zero or negative):");

        int[] arr = new int[10];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();

            if(arr[i] <= 0){
                break;
            }

            System.out.println("Element at index " + i + " is " + arr[i]);
            sum += arr[i];
        }

        System.out.println("The sum of elements is " + sum);
    }
}
