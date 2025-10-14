// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with custom exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed! Insufficient funds. Current Balance: " + balance
            );
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Prasad", 5000);

        account.deposit(2000);

        try {
            account.withdraw(3000); // valid
            account.withdraw(5000); // this will throw exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
