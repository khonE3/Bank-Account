public class Main {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a BankAccount object
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount bankAccount = new BankAccount("BA1234", 500.0);

        // Deposit operation
        bankAccount.deposit(1000.0);

        // Withdraw operation
        bankAccount.withdraw(600.0);
    }
}
