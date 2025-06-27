class Student {
    // Static variable shared across all Student objects
    static String universityName = "Global University";

    // Static variable to count total students
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;
    final int rollNumber; // Final so rollNumber can't be changed

    // Constructor using 'this' to initialize instance variables
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment count whenever a student is created
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("The object is not a Student.");
        }
    }

    // Method to update grade (only if the object is a Student)
    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to " + newGrade + " for " + name);
        } else {
            System.out.println("Cannot update grade. The object is not a Student.");
        }
    }
}

// Main class to test the Student class
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Alice Brown", 101, "A");
        Student s2 = new Student("Bob Martin", 102, "B");
        Student s3 = new Student("Carol White", 103, "A+");

        // Display total students
        Student.displayTotalStudents();
        System.out.println();

        // Display details
        System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        s2.displayDetails();
        System.out.println();

        // Update grade
        s2.updateGrade("A-");
        System.out.println();

        // Display details after grade update
        System.out.println("Student 2 Details after grade update:");
        s2.displayDetails();
        System.out.println();

        // Check instanceof explicitly
        Object obj = s3;
        if (obj instanceof Student) {
            System.out.println("obj is an instance of Student.");
        } else {
            System.out.println("obj is NOT an instance of Student.");
        }
    }
}
