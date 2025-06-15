import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        int height1 = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int height2 = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int height3 = sc.nextInt();

        // Find youngest
        String youngest;
        if (age1 <= age2 && age1 <= age3) {
            youngest = "Amar";
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Find tallest
        String tallest;
        if (height1 >= height2 && height1 >= height3) {
            tallest = "Amar";
        } else if (height2 >= height1 && height2 >= height3) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Output
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
