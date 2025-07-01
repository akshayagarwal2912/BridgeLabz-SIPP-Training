import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Order class
class Order {
    String orderId;
    List<Product> products = new ArrayList<>();

    Order(String orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " - Products:");
        for (Product p : products) {
            p.showProduct();
        }
    }
}

// Customer class
class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println("Customer " + name + " placed Order " + o.orderId);
    }

    void showOrders() {
        System.out.println("Customer: " + name + " - Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        Product p3 = new Product("Keyboard", 45.0);

        // Create customer
        Customer c1 = new Customer("Alice");

        // Create orders
        Order o1 = new Order("ORD001");
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order("ORD002");
        o2.addProduct(p3);

        // Customer places orders
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        // Show all orders of the customer
        c1.showOrders();
    }
}
