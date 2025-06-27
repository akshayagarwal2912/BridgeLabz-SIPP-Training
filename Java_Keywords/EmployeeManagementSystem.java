class Employee {
    // Static variable shared by all Employee objects
    static String companyName = "Tech Innovators Pvt. Ltd.";
    
    // Static variable to keep track of total employees
    static int totalEmployees = 0;
    
    // Instance variables
    String name;
    String designation;
    final int id; // Final variable so ID cannot be changed

    // Constructor using 'this' to initialize instance variables
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employee count whenever a new Employee is created
    }

    // Static method to display the total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details, using instanceof check
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("The object is not an Employee.");
        }
    }
}

// Main class to test the Employee class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");
        Employee emp3 = new Employee("Carol Williams", 103, "QA Analyst");

        // Display total employees
        Employee.displayTotalEmployees();
        System.out.println();

        // Display details of each employee
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();
        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.displayDetails();
        System.out.println();

        System.out.println("Employee 3 Details:");
        emp3.displayDetails();
        System.out.println();

        // Checking instanceof explicitly
        Object obj = emp2;
        if (obj instanceof Employee) {
            System.out.println("obj is an instance of Employee.");
        } else {
            System.out.println("obj is NOT an instance of Employee.");
        }
    }
}
