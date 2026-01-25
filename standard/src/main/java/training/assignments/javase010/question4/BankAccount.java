package training.assignments.javase010.question4;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("BZ001", "VIN DIESEL", 10000);

        System.out.println(bankAccount.withdraw(2000));
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {

        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountNumber(String accountNumber) {
        if (accountNumber.isEmpty()) {
            System.out.println("Account number cannot be empty");
        }
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty()) {
            System.out.println("Account name cannot be empty");
        }
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    protected double setBalance(double balance) {
        if (balance < 0) {
            System.out.println("The balance cannot be negative");
        }
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be a positive");
        }
        return setBalance(getBalance() + amount);
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be a positive");
        }
        if (amount > getBalance()) {
            System.out.println("Insufficient balance");
        }
        return setBalance(getBalance() - amount);
    }
}
