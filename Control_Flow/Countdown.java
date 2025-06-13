import java.util.*;
public class Countdown {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the countdown for Rocket launch: ");
        int n = scn.nextInt();
        while(n > 0){//
            System.out.println("Time left for Rocket Launch: " + n + " seconds");// Print the countdown time
            n--; // Decrement the countdown
        }
        System.out.println("LAUNCH!"); // Print launch message when countdown reaches zero
    }
}