// CarRental.java

public class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;

    // Rental cost per day (can be adjusted as needed)
    static final int COST_PER_DAY = 1000;

    // Constructor to initialize details
    public CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    // Method to calculate total rental cost
    public int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a rental object
        CarRental rental = new CarRental("Akshay", "Hyundai i20", 5);

        // Displaying the rental details
        rental.displayDetails();
    }
}
