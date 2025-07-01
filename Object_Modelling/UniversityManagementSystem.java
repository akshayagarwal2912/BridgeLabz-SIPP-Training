import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String name;
    Professor professor; // One professor teaches this course
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        professor = p;
        p.assignCourse(this);
        System.out.println("Professor " + p.name + " assigned to course " + name);
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
        s.enrollCourse(this);
        System.out.println("Student " + s.name + " enrolled in course " + name);
    }

    void showCourseDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        } else {
            System.out.println("No professor assigned.");
        }
        System.out.println("Enrolled Students:");
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

    void enrollCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
    }

    void showCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

// Professor class
class Professor {
    String name;
    List<Course> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
    }

    void showCourses() {
        System.out.println("Professor: " + name + " - Teaching Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        // Assign professors to courses
        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        // Enroll students in courses
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        // Show course details
        c1.showCourseDetails();
        c2.showCourseDetails();

        // Show each student's courses
        s1.showCourses();
        s2.showCourses();

        // Show each professor's courses
        prof1.showCourses();
        prof2.showCourses();
    }
}
