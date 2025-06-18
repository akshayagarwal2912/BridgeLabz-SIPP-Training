import java.util.*;

public class StudentVoteChecker {

    // Method to check if student is eligible to vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt(); 
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            boolean eligible = canStudentVote(ages[i]);
            if (eligible) {
                System.out.println("Student " + (i + 1) + ": Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + ": Cannot Vote");
            }
        }
    }
}
