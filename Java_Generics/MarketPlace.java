package Java_Generics;

// Category Interfaces
interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Book";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadget";
    }
}

// Generic Product Class
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void showDetails() {
        System.out.println("Product: " + name);
        System.out.println("Category: " + category.getCategoryName());
        System.out.println("Price: ₹" + price);
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }
}

// Utility class with generic method
class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double original = product.getPrice();
        double discount = original * (percent / 100);
        product.setPrice(original - discount);
    }
}

// Main class
public class MarketPlace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Guide", 500.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000.0, new GadgetCategory());

        System.out.println("Before Discount:");
        book.showDetails();
        shirt.showDetails();
        phone.showDetails();

        // Apply 10% discount
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        book.showDetails();
        shirt.showDetails();
        phone.showDetails();
    }
}
