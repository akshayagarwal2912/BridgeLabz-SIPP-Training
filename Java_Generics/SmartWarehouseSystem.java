import java.util.*;
abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public abstract void display();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Electronics: " + name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Groceries: " + name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Furniture: " + name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}