// Employee.java

class Employee {
    public int employeeID;          // public
    protected String department;    // protected
    private double salary;          // private

    // Constructor
    public Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // Public method to set salary
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass to access employeeID and department
class Manager extends Employee {

    // Constructor
    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    // Display manager's basic info
    public void showManagerInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Main class
public class CompanyRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 30000);
        e1.showDetails();

        System.out.println();

        Manager m1 = new Manager(102, "IT", 50000);
        m1.showManagerInfo();

        m1.setSalary(55000); // Update salary
        System.out.println("Updated Salary: ₹" + m1.getSalary());
    }
}
