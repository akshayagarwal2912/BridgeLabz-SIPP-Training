import java.util.ArrayList;
import java.util.List;

// Faculty class (can exist independently)
class Faculty {
    String name;
    String designation;

    Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name + ", Designation: " + designation);
    }
}

// Department class (composition relationship)
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void showDepartment() {
        System.out.println("Department: " + name);
    }
}

// University class
class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> facultyMembers = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty f) {
        facultyMembers.add(f);
    }

    void showUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.showDepartment();
        }
        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            f.showFaculty();
        }
    }

    void deleteUniversity() {
        departments.clear(); // Composition: deleting all departments
        System.out.println("University and its Departments are deleted.");
    }
}

public class UniversityFacultyDepartment {
    public static void main(String[] args) {
        // Create faculty members (can exist independently)
        Faculty f1 = new Faculty("Dr. Smith", "Professor");
        Faculty f2 = new Faculty("Dr. Johnson", "Associate Professor");

        // Create university
        University u = new University("Global Tech University");

        // Add departments
        u.addDepartment("Computer Science");
        u.addDepartment("Mechanical Engineering");

        // Add faculty members to university
        u.addFaculty(f1);
        u.addFaculty(f2);

        // Show university details
        u.showUniversityDetails();

        // Delete the university
        u.deleteUniversity();

        // Show that faculty members still exist independently
        System.out.println("Independent Faculty Members:");
        f1.showFaculty();
        f2.showFaculty();
    }
}
