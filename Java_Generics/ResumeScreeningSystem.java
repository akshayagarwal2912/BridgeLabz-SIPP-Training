package Java_Generics;

import java.util.*;

// Abstract JobRole class
abstract class JobRole {
    String candidateName;

    JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    abstract void screen();
}

// Subclasses for different roles
class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) {
        super(name);
    }

    void screen() {
        System.out.println(candidateName + " - Screening for Software Engineer role");
    }
}

class DataScientist extends JobRole {
    DataScientist(String name) {
        super(name);
    }

    void screen() {
        System.out.println(candidateName + " - Screening for Data Scientist role");
    }
}

class ProductManager extends JobRole {
    ProductManager(String name) {
        super(name);
    }

    void screen() {
        System.out.println(candidateName + " - Screening for Product Manager role");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private List<T> applicants = new ArrayList<>();

    void addApplicant(T applicant) {
        applicants.add(applicant);
    }

    List<T> getApplicants() {
        return applicants;
    }
}

// Utility class with wildcard method
class ScreeningSystem {
    static void processResumes(List<? extends JobRole> applicants) {
        for (JobRole applicant : applicants) {
            applicant.screen();
        }
    }
}

// Main class
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addApplicant(new SoftwareEngineer("Akshay"));
        seResumes.addApplicant(new SoftwareEngineer("Priya"));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addApplicant(new DataScientist("Raj"));
        dsResumes.addApplicant(new DataScientist("Meera"));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addApplicant(new ProductManager("Amit"));

        System.out.println("Screening Software Engineers:");
        ScreeningSystem.processResumes(seResumes.getApplicants());

        System.out.println("\nScreening Data Scientists:");
        ScreeningSystem.processResumes(dsResumes.getApplicants());

        System.out.println("\nScreening Product Managers:");
        ScreeningSystem.processResumes(pmResumes.getApplicants());
    }
}
