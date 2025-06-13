import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input the original fee
        System.out.print("Enter the Student Fee: ");
        double fee = scn.nextDouble();

        // Input the discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = scn.nextDouble();

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount);
        System.out.println("Final discounted fee is INR " + finalFee);
    }
}