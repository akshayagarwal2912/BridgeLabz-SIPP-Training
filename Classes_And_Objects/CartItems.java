import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of this item
    double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    // Method to add an item to the cart
    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    // Method to remove an item from the cart by name
    void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(name)) {
                items.remove(i);
                System.out.println(name + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " not found in cart.");
        }
    }

    // Method to display total cost of all items
    void showTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class CartItems {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Pen", 10, 2));
        cart.addItem(new CartItem("Notebook", 50, 1));
        cart.addItem(new CartItem("Pencil", 5, 5));

        cart.removeItem("Notebook");
        cart.showTotal();
    }
}
