import java.util.*;

public class Marks {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter number of students: ");
        int n = scn.nextInt();

        // Arrays to store marks for each subject and computed values
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        int[] total = new int[n];
        int[] percentage = new int[n];

        // Input marks for each student
        for(int i = 0; i < n ; i++){
            System.out.println("\n--- Student " + (i + 1) + " ---");

            // Input marks for Physics
            System.out.println("Enter marks of Physics:");
            physics[i] = scn.nextInt();

            // Input marks for Chemistry
            System.out.println("Enter marks of Chemistry:");
            chemistry[i] = scn.nextInt();

            // Input marks for Maths
            System.out.println("Enter marks of Maths:");
            maths[i] = scn.nextInt();

            // Calculate total and percentage (integer division)
            total[i] = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total[i] * 100) / 300;

            // Display percentage
            System.out.println("Percentage of student is: " + percentage[i] + "%");
        }

        // Display level for each student
        System.out.println("\n--- Performance Level ---");
        for(int i = 0; i < n; i++){
            System.out.print("Student " + (i + 1) + ": ");
            if(percentage[i] >= 80){
                System.out.println("Level 4");
            }
            else if(percentage[i] >= 70){
                System.out.println("Level 3");
            }
            else if(percentage[i] >= 60){
                System.out.println("Level 2");
            }
            else if(percentage[i] >= 40){
                System.out.println("Level 1");
            }
            else {
                System.out.println("Level 0");
            }
        }
    }
}
