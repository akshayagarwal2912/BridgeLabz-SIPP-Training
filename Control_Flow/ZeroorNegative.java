import java.util.*;
public class ZeroorNegative {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number (0 or negative) to stop): ");
            int n = scn.nextInt();
            sum += n; // Add the input number to the sum
            if(n <= 0){
                break; // Exit the loop if the number is zero or negative
            }
        }
        System.out.println("Sum of numbers entered: " + sum);
    }
}
