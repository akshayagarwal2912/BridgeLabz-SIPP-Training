import java.util.*;

public class Chocolates {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int total, int kids) {
        int[] result = new int[2];
        result[0] = total / kids;     // Chocolates per child
        result[1] = total % kids;     // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for chocolates and children
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] ans = findRemainderAndQuotient(chocolates, children);

        // Printing result
        System.out.println("Chocolates per child: " + ans[0]);
        System.out.println("Remaining chocolates: " + ans[1]);
    }
}
