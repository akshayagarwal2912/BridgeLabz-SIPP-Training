import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showEmployee() {
        System.out.println("Employee: " + name + ", Role: " + role);
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName, String role) {
        employees.add(new Employee(empName, role));
    }

    void showDepartment() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.name.equalsIgnoreCase(deptName)) {
                return dept;
            }
        }
        return null;
    }

    void showCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showDepartment();
        }
    }

    void deleteCompany() {
        departments.clear(); // clears all departments and their employees
        System.out.println("Company and all associated departments and employees are deleted.");
    }
}

public class CompanyDepartmentEmployee {
    public static void main(String[] args) {
        Company c = new Company("TechSoft");

        c.addDepartment("HR");
        c.addDepartment("Engineering");

        Department hr = c.getDepartment("HR");
        Department eng = c.getDepartment("Engineering");

        if (hr != null) {
            hr.addEmployee("Alice", "HR Manager");
            hr.addEmployee("Bob", "Recruiter");
        }

        if (eng != null) {
            eng.addEmployee("Charlie", "Software Engineer");
            eng.addEmployee("Dave", "DevOps Engineer");
        }

        // Show company structure
        c.showCompanyDetails();

        // Delete the company (and all contained departments/employees)
        c.deleteCompany();
    }
}
