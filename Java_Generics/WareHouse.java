package Java_Generics;

import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}

// Subclasses
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void display() {
        System.out.println("Electronics: " + name);
    }
}

class Grocery extends WarehouseItem {
    Grocery(String name) {
        super(name);
    }

    void display() {
        System.out.println("Grocery: " + name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    void display() {
        System.out.println("Furniture: " + name);
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    T getItem(int index) {
        return items.get(index);
    }

    List<T> getAllItems() {
        return items;
    }
}

// Utility class
class WarehouseUtils {
    static void showAllItems(List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            item.display();
        }
    }
}

// Main class
public class WareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Grocery("Rice"));
        groceryStorage.addItem(new Grocery("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("All Electronics:");
        WarehouseUtils.showAllItems(electronicsStorage.getAllItems());

        System.out.println("\nAll Groceries:");
        WarehouseUtils.showAllItems(groceryStorage.getAllItems());

        System.out.println("\nAll Furniture:");
        WarehouseUtils.showAllItems(furnitureStorage.getAllItems());
    }
}

