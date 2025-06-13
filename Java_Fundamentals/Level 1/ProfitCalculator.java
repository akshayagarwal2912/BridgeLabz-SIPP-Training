public class ProfitCalculator {
    public static void main(String[] args) {
        int costPrice = 129;// Example cost price in INR
        int sellingPrice = 191;//

        int profit = sellingPrice - costPrice;// Calculate profit by subtracting cost price from selling price
        double profitPercentage = (profit * 100.0) / costPrice;// Calculate profit percentage

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );// Output the results
    }
}
