import java.util.*;
public class BubbleSortMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Students:");
        int n = scn.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of the students:");
        for(int i = 0; i < n; i++){
            marks[i] = scn.nextInt();
        }
    }
}
