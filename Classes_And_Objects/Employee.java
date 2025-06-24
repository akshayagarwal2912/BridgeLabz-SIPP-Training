class Employee {
    String name;
    int id;
    double salary;

    // Constructor to initialize employee attributes
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an employee object
        Employee e = new Employee("Akshay", 101, 50000);
        
        // Displaying the employee details
        e.showDetails();
    }
}
