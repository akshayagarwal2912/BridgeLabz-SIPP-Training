public class UniversityFee {
    public static void main(String[] args) {
        // Assign the original fee
        int fee = 125000;
        // Assign the discount percentage
        int discountPercent = 10;

        // Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculate the final fee after discount
        int finalFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}