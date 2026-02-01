package training.assignments.javase014.question2;

public class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws InvalidTransactionException {
        if (accountNumber.isBlank() || accountNumber == null) {
            throw new InvalidTransactionException("Invalid Account");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isBlank() || accountHolder.isEmpty()) {
            System.out.println("Please enter the account Name");
        } else {
            this.accountHolder = accountHolder;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be a negative");
        } else {
            this.balance = balance;

        }
    }

    public void deposit(double amount) throws InvalidTransactionException {

        if (amount < 0) {
            throw new InvalidTransactionException("The amount cannot be negative");
        } else {
            balance += amount;
        }

    }

    public void withdraw(double amount) throws InvalidTransactionException, InsufficientFundsException {

        if (amount < 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        } else {
            balance -= amount;
        }

    }

    public void transfer(double amount, String toAccount)
            throws InvalidTransactionException, InsufficientFundsException, AccountNotFoundException {
        if (amount < 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Please enter a valid account Number to transfer to");
        } else {
            balance -= amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account name is: " + accountHolder);
        System.out.println("Acount number is: " + accountNumber);
        System.out.println("Balance is: " + balance);
    }
}
