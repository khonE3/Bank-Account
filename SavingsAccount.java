public class SavingsAccount extends BankAccount {
    // Minimum balance constant
    private static final double MIN_BALANCE = 100.0;

    // Constructor to initialize account number and balance
    public SavingsAccount(String accountNumber, double balance) {
        // Call the parent class constructor
        super(accountNumber, balance);
    }

    // Override the withdraw method from the parent class
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot drop below $" + MIN_BALANCE);
        }
    }
}
