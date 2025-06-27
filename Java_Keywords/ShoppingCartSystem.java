class Product {
    // Static variable shared by all Product objects
    static double discount = 10.0; // Discount in percentage

    // Instance variables
    String productName;
    double price;
    int quantity;
    final String productID; // Final variable so ID cannot be changed

    // Constructor using 'this' to initialize instance variables
    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Method to display product details with discount applied
    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price per Unit: $" + price);
            System.out.println("Quantity: " + quantity);
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Discounted Price per Unit: $" + discountedPrice);
        } else {
            System.out.println("The object is not a Product.");
        }
    }
}

// Main class to test the Product class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create Product objects
        Product p1 = new Product("Wireless Mouse", 25.0, 2, "PROD-001");
        Product p2 = new Product("Keyboard", 45.0, 1, "PROD-002");

        // Display details of each product
        System.out.println("Product 1 Details:");
        p1.displayDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        p2.displayDetails();
        System.out.println();

        // Update the discount
        Product.updateDiscount(15.0);
        System.out.println();

        // Display details again after discount update
        System.out.println("Product 1 Details after discount update:");
        p1.displayDetails();
        System.out.println();

        // Checking instanceof explicitly
        Object obj = p2;
        if (obj instanceof Product) {
            System.out.println("obj is an instance of Product.");
        } else {
            System.out.println("obj is NOT an instance of Product.");
        }
    }
}
