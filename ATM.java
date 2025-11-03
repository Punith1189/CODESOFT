import java.util.*;

class ATM {
    private double balance;
    private List<String> history = new ArrayList<>();

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history.add("Deposited: ₹" + amount);
            System.out.println("✅ Deposited ₹" + amount);
        } else {
            System.out.println("❌ Invalid amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Withdrew: ₹" + amount);
            System.out.println("✅ Withdrew ₹" + amount);
        } else if (amount > balance) {
            System.out.println("⚠️ Insufficient balance");
        } else {
            System.out.println("❌ Invalid withdrawal amount");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    // Show transaction history
    public void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("📜 No transactions yet.");
        } else {
            System.out.println("📒 Transaction History:");
            for (String t : history) {
                System.out.println("- " + t);
            }
        }
    }
}

// User class for login system
class User {
    private String userId;
    private int pin;

    public User(String userId, int pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean validate(String id, int enteredPin) {
        return userId.equals(id) && pin == enteredPin;
    }
}

// Main class
public class ATMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        User user = new User("user123", 1234); // Default credentials

        System.out.println("===================================");
        System.out.println("       🏦 Welcome to Java ATM       ");
        System.out.println("===================================");

        // Login step
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (!user.validate(id, pin)) {
            System.out.println("❌ Invalid credentials. Exiting...");
            sc.close();
            return;
        }

        System.out.println("✅ Login successful!\n");

        int choice;
        do {
            System.out.println("\n========= ATM MENU =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> atm.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                }
                case 4 -> atm.viewHistory();
                case 5 -> System.out.println("👋 Thank you for using Java ATM!");
                default -> System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
