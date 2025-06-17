import java.util.*;
public class NaturalSum {
    public static int SumNum(int num){
        int sum=0;
        for(int i = 1; i <= num; i++ ){
            sum += i ;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the number to find the sum of natural numbers:");
        int num = scn.nextInt();
        System.out.println("Sum of Natural Numbers = " + SumNum(num));
    }
}
