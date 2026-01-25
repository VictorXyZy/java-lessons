package training.assignments.javase010.question4;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        setInterestRate(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double setInterestRate(double interestRate) {
        if (interestRate == 0) {
            System.out.println("Interest Rate cannot be negative");
        }
        return interestRate;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient balance");
        }
        if (getBalance() - amount < 100) {
            System.out.println("Balance cannot be below $100");
        }
        return setBalance(getBalance() - amount);
    }

    public double applyInterest() {
        double interest = getBalance() * interestRate;
        return setBalance(getBalance() + interest);
    }

}
