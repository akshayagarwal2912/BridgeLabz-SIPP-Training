import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0 - phy, 1 - chem, 2 - math
        int[] total = new int[n];
        int[] percent = new int[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " (Physics, Chemistry, Math):");
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Invalid marks! Enter again.");
                    i--; // go back to this student
                    break;
                }
                marks[i][j] = m;
                total[i] += m;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percent[i] = total[i] / 3;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Output the result
        System.out.println("\nMarks, Percentage, and Grade:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                " - Physics: " + marks[i][0] +
                ", Chemistry: " + marks[i][1] +
                ", Math: " + marks[i][2] +
                ", %: " + percent[i] +
                ", Grade: " + grade[i]);
        }
    }
}
