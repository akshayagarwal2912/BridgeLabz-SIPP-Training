import java.util.*;
abstract class CourseType {
    abstract void evaluate();
}

class ExamCourse extends CourseType {
    public void evaluate() {
        System.out.println("Exam-based evaluation.");
    }
}

class AssignmentCourse extends CourseType {
    public void evaluate() {
        System.out.println("Assignment-based evaluation.");
    }
}

class ResearchCourse extends CourseType {
    public void evaluate() {
        System.out.println("Research-based evaluation.");
    }
}

class Course<T extends CourseType> {
    T type;
    public Course(T type) {
        this.type = type;
    }
    public void conductEvaluation() {
        type.evaluate();
    }
    public static void evaluateAll(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}