public class BankAccount {
    // Private field to store the account number
    private String accountNumber;
    // Private field to store the balance
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit $" + amount + " into account " + accountNumber + ":");
            System.out.println("New balance after depositing $" + amount + ": $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from account " + accountNumber + ":");
            System.out.println("New balance after withdrawing $" + amount + ": $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance to withdraw.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        // Return the current balance
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
}
