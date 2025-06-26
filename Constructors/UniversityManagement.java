// Student.java

class Student {
    public int rollNumber;         
    protected String name;         
    private double cgpa;           

    // Constructor
    public Student(int roll, String studentName, double studentCGPA) {
        rollNumber = roll;
        name = studentName;
        cgpa = studentCGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCGPA(double newCGPA) {
        cgpa = newCGPA;
    }

    // Display method
    public void showDetails() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    // Method to show PG student name using protected variable
    public void showPGName() {
        System.out.println("PG Student Name: " + name);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Akshay", 8.5);
        s1.showDetails();

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(2, "Riya", 9.1);
        pg.showPGName();
    }
}
