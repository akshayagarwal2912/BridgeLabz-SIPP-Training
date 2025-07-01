import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    String name;
    List<Doctor> consultedDoctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        consultedDoctors.add(d);
    }

    void showConsultedDoctors() {
        System.out.println("Patient: " + name + " - Consulted Doctors:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- " + d.name);
        }
    }
}

// Doctor class
class Doctor {
    String name;
    String specialization;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Consultation: Dr. " + name + " is consulting Patient " + p.name);
    }

    void showPatients() {
        System.out.println("Doctor: " + name + " - Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

// Hospital class
class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showHospitalDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name + " (" + d.specialization + ")");
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

// Main class
public class HospitalDoctorPatient {
    public static void main(String[] args) {
        // Create hospital
        Hospital h = new Hospital("City Care Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Smith", "Cardiologist");
        Doctor d2 = new Doctor("Johnson", "Dermatologist");

        // Create patients
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        // Add doctors and patients to hospital
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        // Show hospital details
        h.showHospitalDetails();

        // Consultations
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        // Show each doctor's patients
        d1.showPatients();
        d2.showPatients();

        // Show each patient's consulted doctors
        p1.showConsultedDoctors();
        p2.showConsultedDoctors();
    }
}
