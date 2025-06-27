import java.util.ArrayList;

// Customer class with name and balance
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

// Bank class with a list of associated customers
class Bank {
    String name;
    ArrayList<Customer> customers;

    Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    // Associate customer with the bank
    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + name);
    }

    void showCustomers() {
        System.out.println("\nCustomers of " + name + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

public class Association {
    public static void main(String[] args) {
        // Create Bank object
        Bank bank = new Bank("State Bank");

        // Create Customer objects
        Customer c1 = new Customer("Ravi", 5000);
        Customer c2 = new Customer("Priya", 12000);

        // Associate customers with the bank
        bank.openAccount(c1);
        bank.openAccount(c2);

        // Display bank's customers
        bank.showCustomers();

        // Customers view their balances
        System.out.println();
        c1.viewBalance();
        c2.viewBalance();
    }
}
