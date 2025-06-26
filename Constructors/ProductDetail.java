// Product.java

public class ProductDetail {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared by all Product objects)
    static int totalProducts = 0;

    // Constructor to initialize product details
    public ProductDetail(String name, double cost) {
        productName = name;
        price = cost;
        totalProducts++;  // Increment count whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the class
    public static void main(String[] args) {
        ProductDetail p1 = new ProductDetail("Laptop", 45000);
        ProductDetail p2 = new ProductDetail("Phone", 25000);

        // Display individual product details
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        // Display total products created
        ProductDetail.displayTotalProducts();
    }
}
