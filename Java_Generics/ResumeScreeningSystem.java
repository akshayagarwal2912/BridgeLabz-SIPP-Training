import java.util.*;
abstract class JobRole {
    String candidateName;
    public JobRole(String name) {
        this.candidateName = name;
    }
    abstract void review();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }
    public void review() {
        System.out.println("Reviewing Software Engineer: " + candidateName);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }
    public void review() {
        System.out.println("Reviewing Data Scientist: " + candidateName);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }
    public void review() {
        System.out.println("Reviewing Product Manager: " + candidateName);
    }
}

class Resume<T extends JobRole> {
    T role;
    public Resume(T role) {
        this.role = role;
    }
    public void process() {
        role.review();
    }
    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            r.review();
        }
    }
}