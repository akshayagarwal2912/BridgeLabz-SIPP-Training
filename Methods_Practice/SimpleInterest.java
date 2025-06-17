import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class SimpleInterest {
    public static double calculateInterest(double principle, double rate, int time){
        double interest = (principle*rate*time)/100;
        return interest;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principle = scn.nextDouble();
        System.out.println("Enter rate of Interest");
        double rate = scn.nextDouble();
        System.out.println("Enter time in years");
        int time = scn.nextInt();
        double interest = calculateInterest(principle,rate,time);
        System.out.println("Simple Interest = " + interest);
    }
}
