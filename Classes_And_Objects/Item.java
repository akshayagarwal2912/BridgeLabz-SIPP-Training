class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize item attributes
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void showDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    // Method to calculate total cost for a given quantity
    double getTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Pen", 10.5);  // Example item
        i.showDetails();
        int qty = 3;
        System.out.println("Total cost for " + qty + " units: " + i.getTotalCost(qty));
    }
}
