
class BankAccount {
    private double balance;
    private String accountHolderName;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        obj.deposit(10000);
        obj.withdraw(500);
        obj.withdraw(800); // test insufficient balance
    }
}