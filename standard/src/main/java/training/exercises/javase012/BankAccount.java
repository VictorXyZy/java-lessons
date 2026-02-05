package training.exercises.javase012;

public class BankAccount {

    private static int totalAccounts = 0;
    public static final String bankName = "Global Trust Bank";
    private static double interestRate = 0.05;

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void setInterestRate(double rate) {
        if (rate >= 0) {
            interestRate = rate;
        } else {
            System.out.println("Interest rate cannot be negative");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit cannot be negative");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be negative");
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        balance -= amount;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    public void display() {
        System.out.println(
                "Account Number: " + accountNumber +
                        ", Holder: " + accountHolder +
                        ", Balance: $" + balance);
    }
}
