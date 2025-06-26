// Course.java

public class Course {
    // Instance variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class variable (shared across all courses)
    static String instituteName = "GLA Institute";

    // Constructor to initialize course details
    public Course(String name, int weeks, double courseFee) {
        courseName = name;
        duration = weeks;
        fee = courseFee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 6000);
        Course c2 = new Course("Web Development", 10, 7500);

        // Display original course details
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("TechSkill Academy");

        // Display updated details
        System.out.println("After Institute Name Update:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
