import java.util.*;
public class SmallestLargest {
    public static void findSmallestAndLargest(int num1, int num2, int num3){
        int smallest = num1;
        int largest = num1;

        if(num2 < smallest) {
            smallest = num2;
        }
        if(num3 < smallest) {
            smallest = num3;
        }

        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter 3 numbes to be compared");
       int num1 = scn.nextInt();
       int nums2 = scn.nextInt();
       int num3 = scn.nextInt();
        findSmallestAndLargest(num1, nums2, num3); 
    }    
}
