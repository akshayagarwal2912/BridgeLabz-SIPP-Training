class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor to initialize phone attributes
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 69999.0);
        phone.showDetails();
    }
}
