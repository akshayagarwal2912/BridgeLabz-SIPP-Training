package Java_Generics;

import java.util.*;

// Abstract base class
abstract class CourseType {
    String title;

    CourseType(String title) {
        this.title = title;
    }

    abstract void showEvaluationMethod();
}

// Subclasses
class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }

    void showEvaluationMethod() {
        System.out.println(title + " - Evaluated by Exams");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }

    void showEvaluationMethod() {
        System.out.println(title + " - Evaluated by Assignments");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }

    void showEvaluationMethod() {
        System.out.println(title + " - Evaluated by Research Work");
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    void addCourse(T course) {
        courseList.add(course);
    }

    List<T> getAllCourses() {
        return courseList;
    }
}

// Utility class using wildcard
class CourseUtils {
    static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.showEvaluationMethod();
        }
    }
}

// Main class
public class UniversityCourseSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examDept = new Course<>();
        examDept.addCourse(new ExamCourse("Mathematics"));
        examDept.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentDept = new Course<>();
        assignmentDept.addCourse(new AssignmentCourse("Design Thinking"));
        assignmentDept.addCourse(new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> researchDept = new Course<>();
        researchDept.addCourse(new ResearchCourse("AI Project"));
        researchDept.addCourse(new ResearchCourse("Thesis Writing"));

        System.out.println("Exam Courses:");
        CourseUtils.displayAllCourses(examDept.getAllCourses());

        System.out.println("\nAssignment Courses:");
        CourseUtils.displayAllCourses(assignmentDept.getAllCourses());

        System.out.println("\nResearch Courses:");
        CourseUtils.displayAllCourses(researchDept.getAllCourses());
    }
}
