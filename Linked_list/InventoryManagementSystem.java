import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    private Item head;

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }

    public void addAtPosition(int pos, String itemName, int itemId, int quantity, double price) {
        if (pos <= 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null) {
            addAtEnd(itemName, itemId, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public boolean updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Item searchById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public Item searchByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public double totalInventoryValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    public void displayAll() {
        Item temp = head;
        if (temp == null) {
            System.out.println("No items in inventory.");
            return;
        }
        System.out.println("ItemID\tName\tQty\tPrice");
        while (temp != null) {
            System.out.println(temp.itemId + "\t" + temp.itemName + "\t" + temp.quantity + "\t" + temp.price);
            temp = temp.next;
        }
    }

    // Merge sort by item name or price
    public void sortInventory(int sortBy, boolean ascending) {
        head = mergeSort(head, sortBy, ascending);
    }

    private Item mergeSort(Item node, int sortBy, boolean ascending) {
        if (node == null || node.next == null) return node;
        Item middle = getMiddle(node);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(node, sortBy, ascending);
        Item right = mergeSort(nextOfMiddle, sortBy, ascending);
        return sortedMerge(left, right, sortBy, ascending);
    }

    private Item sortedMerge(Item a, Item b, int sortBy, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        boolean cmp;
        if (sortBy == 1) // Name
            cmp = ascending ? a.itemName.compareToIgnoreCase(b.itemName) <= 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else // Price
            cmp = ascending ? a.price <= b.price : a.price > b.price;
        Item result;
        if (cmp) {
            result = a;
            result.next = sortedMerge(a.next, b, sortBy, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, sortBy, ascending);
        }
        return result;
    }

    private Item getMiddle(Item node) {
        if (node == null) return node;
        Item slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Item ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by Item ID");
            System.out.println("7. Search by Item Name");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort by Name Asc");
            System.out.println("10. Sort by Name Desc");
            System.out.println("11. Sort by Price Asc");
            System.out.println("12. Sort by Price Desc");
            System.out.println("13. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    if (choice == 1) ims.addAtBeginning(name, id, qty, price);
                    else if (choice == 2) ims.addAtEnd(name, id, qty, price);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        ims.addAtPosition(pos, name, id, qty, price);
                    }
                    break;
                case 4:
                    System.out.print("Enter Item ID to remove: ");
                    int remId = sc.nextInt();
                    ims.removeByItemId(remId);
                    break;
                case 5:
                    System.out.print("Enter Item ID to update: ");
                    int upId = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    if (ims.updateQuantity(upId, newQty)) System.out.println("Quantity updated.");
                    else System.out.println("Item not found.");
                    break;
                case 6:
                    System.out.print("Enter Item ID to search: ");
                    int searchId = sc.nextInt();
                    Item found = ims.searchById(searchId);
                    if (found != null) System.out.println("Found: " + found.itemName + ", Qty: " + found.quantity + ", Price: " + found.price);
                    else System.out.println("Item not found.");
                    break;
                case 7:
                    System.out.print("Enter Item Name to search: ");
                    String searchName = sc.nextLine();
                    Item foundN = ims.searchByName(searchName);
                    if (foundN != null) System.out.println("Found: " + foundN.itemName + ", Qty: " + foundN.quantity + ", Price: " + foundN.price);
                    else System.out.println("Item not found.");
                    break;
                case 8:
                    System.out.println("Total Inventory Value: " + ims.totalInventoryValue());
                    break;
                case 9:
                    ims.sortInventory(1, true);
                    System.out.println("Sorted by Name Ascending.");
                    break;
                case 10:
                    ims.sortInventory(1, false);
                    System.out.println("Sorted by Name Descending.");
                    break;
                case 11:
                    ims.sortInventory(2, true);
                    System.out.println("Sorted by Price Ascending.");
                    break;
                case 12:
                    ims.sortInventory(2, false);
                    System.out.println("Sorted by Price Descending.");
                    break;
                case 13:
                    ims.displayAll();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}