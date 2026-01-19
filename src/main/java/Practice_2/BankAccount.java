package Practice_2;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        // Check if balance is not negative
        if (initialBalance < 0) {
            System.out.println("Invalid initial balance. Must be greater than zero.");
            this.balance = 0;
        }
        else {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Check if amount is not negative
        if (amount < 0) {
            System.out.println("Invalid amount. Must be greater than zero.");
        }
        else {
            this.balance += amount;
            System.out.println("Deposited " + amount + " to balance.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
