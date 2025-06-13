import java.util.*;
public class divisible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisibility by 5:");
        int num = sc.nextInt();
        if(num % 5== 0){// Check if the number is divisible by 5
            System.out.println(num + " is divisible by 5");     // Print the result
        }
        else{
            System.out.println(num + " is not divisible by 5"); 
        }
    }
}