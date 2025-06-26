class BankAccount {
    // Static variable shared across all instances
    static String bankName = "ChatBank";
    static int totalAccounts = 0;

    // Final variable: account number should not be changed once assigned
    final int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor using 'this' keyword to resolve ambiguity
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method to return total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    // Display account details
    void displayDetails() {
        // instanceof used before accessing details
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: ₹" + this.balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
}

// Main class to test the program
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Akshay Agarwal", 1001, 5000.00);
        BankAccount acc2 = new BankAccount("Neha Sharma", 1002, 12000.00);

        acc1.displayDetails();
        System.out.println();

        acc2.displayDetails();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}
