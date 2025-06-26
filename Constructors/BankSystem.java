class BankAccount {
    public String accountNumber;       
    protected String accountHolder;    
    private double balance;            

    // Constructor
    public BankAccount(String accNo, String holder, double initialBalance) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = initialBalance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    // Display account details
    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    // Method to show limited info using inherited access
    public void showBasicInfo() {
        System.out.println("Savings Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("123456", "Akshay", 15000);
        b1.showAccountDetails();

        System.out.println();

        SavingsAccount sa = new SavingsAccount("789012", "Riya", 20000);
        sa.showBasicInfo();

        sa.setBalance(25000); // Update balance
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
