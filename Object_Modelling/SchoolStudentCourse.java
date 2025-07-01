import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String name;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + name + " - Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

// School class
class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + name + " - Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Main class
public class SchoolStudentCourse {
    public static void main(String[] args) {
        // Create school
        School school = new School("Sunrise Public School");

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("English");

        // Add students to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Students enroll in courses
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);

        s2.enrollInCourse(c2);
        s2.enrollInCourse(c3);

        // Display school students
        school.showStudents();

        // Display each student's courses
        s1.showCourses();
        s2.showCourses();

        // Display each course's enrolled students
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
}
