import java.util.*;

public class StudentScorecard {

    // Method to generate random PCM marks for all students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: P, C, M

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics (40–100)
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][4]; // [total, average, percent, gradeIndex]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return result;
    }

    // Method to get grade based on percentage
    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    // Method to display the final scorecard
    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            double percent = stats[i][2];
            String grade = getGrade(percent);

            System.out.printf("S%02d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                stats[i][0],
                stats[i][1],
                stats[i][2],
                grade);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);
    }
}
