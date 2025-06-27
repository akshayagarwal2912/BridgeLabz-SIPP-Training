class Patient {
    // Static variable shared among all Patient objects
    static String hospitalName = "Sunrise Multispeciality Hospital";

    // Static variable to count total patients
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;
    final String patientID; // Final so it can't be changed

    // Constructor using 'this' to initialize instance variables
    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment count when a new patient is created
    }

    // Static method to display total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("The object is not a Patient.");
        }
    }
}

// Main class to test the Patient class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create Patient objects
        Patient p1 = new Patient("Ravi Sharma", 45, "Diabetes", "PAT-001");
        Patient p2 = new Patient("Meena Gupta", 30, "Fracture", "PAT-002");

        // Display total patients
        Patient.getTotalPatients();
        System.out.println();

        // Display patient details
        System.out.println("Patient 1 Details:");
        p1.displayDetails();
        System.out.println();

        System.out.println("Patient 2 Details:");
        p2.displayDetails();
        System.out.println();

        // Checking instanceof explicitly
        Object obj = p2;
        if (obj instanceof Patient) {
            System.out.println("obj is an instance of Patient.");
        } else {
            System.out.println("obj is NOT an instance of Patient.");
        }
    }
}
