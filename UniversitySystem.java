interface Graded {
    void assignGrade(Student s, String g);
}

class Student {
    String n;
    int id;
    private double gpa;
    
    Student(String n, int id) {
        this.n = n;
        this.id = id;
        this.gpa = 0.0;
    }
    
    Student(String n, int id, double g) {
        this.n = n;
        this.id = id;
        this.gpa = g;
    }
    
    public void updateGpa(double p, int c) {
        this.gpa = p / c;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void showTranscript() {
        System.out.println("Transcript for " + n + ": GPA = " + gpa);
    }
}

class UG extends Student {
    UG(String n, int id) {
        super(n, id);
    }
}

class PG extends Student {
    PG(String n, int id) {
        super(n, id);
    }
}

class Course {
    String t;
    int code;
    
    Course(String t, int code) {
        this.t = t;
        this.code = code;
    }
}

class Faculty implements Graded {
    String n;
    
    Faculty(String n) {
        this.n = n;
    }
    
    public void assignGrade(Student s, String g) {
        double p = 0;
        if (g.equals("A")) p = 4.0;
        else if (g.equals("B")) p = 3.0;
        else if (g.equals("C")) p = 2.0;
        else if (g.equals("PASS")) p = 3.5;
        else p = 0.0;
        
        s.updateGpa(p, 1);
        System.out.println("Grade assigned: " + g + " (" + p + " points)");
    }
}

class Enroll {
    Student s;
    Course c;
    
    Enroll(Student s, Course c) {
        this.s = s;
        this.c = c;
    }
    
    public void enroll() {
        System.out.println(s.n + " enrolled in " + c.t);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        UG u = new UG("Akshay", 69);
        PG p = new PG("Aditya", 420);
        
        Course cr = new Course("Math", 24);
        
        Enroll e1 = new Enroll(u, cr);
        e1.enroll();
        
        Enroll e2 = new Enroll(p, cr);
        e2.enroll();
        
        Faculty f = new Faculty("Mr. Avdhesh");
        
        f.assignGrade(u, "A");
        f.assignGrade(p, "PASS");
        
        u.showTranscript();
        p.showTranscript();
        
        if (u.getGpa() > p.getGpa()) {
            System.out.println(u.n + " has higher GPA.");
        } else {
            System.out.println(p.n + " has higher GPA.");
        }
    }
}
