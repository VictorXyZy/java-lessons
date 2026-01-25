package training.assignments.javase010.question4;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        setOverdraftLimit(overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit < 0) {
            System.out.println("Overdraft amount cannot be negative");
        }
        return overdraftLimit;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be a positive");
        } else if (getBalance() - amount < overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }
        return setBalance(getBalance() - amount);
    }

}
