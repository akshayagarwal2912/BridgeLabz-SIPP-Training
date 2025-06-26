// Vehicle.java

public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (common for all vehicles)
    static double registrationFee = 5000;

    // Constructor to initialize vehicle details
    public Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Akshay", "Car");
        Vehicle v2 = new Vehicle("Riya", "Bike");

        // Display original details
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(6000);

        // Display updated details
        System.out.println("After Registration Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
