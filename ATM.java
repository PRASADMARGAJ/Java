import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;

    
    public ATM(double initialBalance, int initialPin) {
        this.balance = initialBalance;
        this.pin = initialPin;
    }

   
    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            checkBalance();
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }


    public void changePin(Scanner scanner) {
        System.out.print("Enter your current PIN: ");
        int oldPin = scanner.nextInt();

        if (oldPin == pin) {
            System.out.print("Enter your new PIN: ");
            int newPin = scanner.nextInt();
            System.out.print("Re-enter your new PIN to confirm: ");
            int confirmPin = scanner.nextInt();

            if (newPin == confirmPin) {
                pin = newPin;
                System.out.println("PIN changed successfully!");
            } else {
                System.out.println("New PINs do not match! Try again.");
            }
        } else {
            System.out.println("Incorrect current PIN!");
        }
    }

    public boolean verifyPin(Scanner scanner) {
        System.out.print("Enter your ATM PIN: ");
        int enteredPin = scanner.nextInt();
        return enteredPin == pin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(5000.00, 1234); 

        System.out.println("===== Welcome to Java ATM =====");

       
        if (atm.verifyPin(scanner)) {
            int choice;
            do {
                System.out.println("\n====== ATM Menu ======");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ₹");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        atm.changePin(scanner);
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again!");
                }
            } while (choice != 5);
        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }

        scanner.close();
    }
}
