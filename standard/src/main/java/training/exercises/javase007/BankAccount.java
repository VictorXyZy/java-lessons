package training.exercises.javase007;

public class BankAccount {

    public String accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialbalance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialbalance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
        } else {
            System.out.println("Invalid input");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);

        } else {
            System.out.println("INVALID");
        }
    }

    public void displayBalance() {
        System.out.println("Your balance is: " + balance);
    }

}
