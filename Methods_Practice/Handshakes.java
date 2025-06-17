import java.util.*;
public class Handshakes {
    public static int numberOfStudents(int students){
         int handshakes = (students * (students - 1)) / 2;
         return handshakes;
    } 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number of Students for Handshakes:");
        int students = scn.nextInt();
        int handshakes = numberOfStudents(students);
        System.out.println("Total Number of Handshakes = " + handshakes);
    }
}
