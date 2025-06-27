// Vehicle Registration System

class Vehicle {
    // Static variable shared across all Vehicle objects
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber; // Final so it cannot be changed

    // Constructor using 'this' to initialize instance variables
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    // Method to display vehicle details
    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("The object is not a Vehicle.");
        }
    }
}

// Main class to test the Vehicle class
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle v1 = new Vehicle("Rajesh Kumar", "Car", "REG-001");
        Vehicle v2 = new Vehicle("Anita Sharma", "Motorcycle", "REG-002");

        // Display details of each vehicle
        System.out.println("Vehicle 1 Details:");
        v1.displayDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        v2.displayDetails();
        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println();

        // Display details again after fee update
        System.out.println("Vehicle 1 Details after fee update:");
        v1.displayDetails();
        System.out.println();

        // Check instanceof explicitly
        Object obj = v2;
        if (obj instanceof Vehicle) {
            System.out.println("obj is an instance of Vehicle.");
        } else {
            System.out.println("obj is NOT an instance of Vehicle.");
        }
    }
}
