package training.assignments.javase014.question2;

public class Main {
    public static void main(String[] args) {

        try {
            BankAccount bankAccount = new BankAccount("456987", "VICTOR XYZY ", 10000);
            bankAccount.deposit(5000);
            System.out.println();
            bankAccount.withdraw(7000);
            System.out.println();
            bankAccount.transfer(1000, "45985");
            System.out.println();
            bankAccount.displayDetails();
        } catch (InsufficientFundsException ife) {
            System.out.println("Insufficient balance");
        } catch (InvalidTransactionException ite) {
            System.out.println("Invalid operation");
        } catch (AccountNotFoundException afe) {
            System.out.println("Account not found");
        }

        // bankAccount.deposit(5000);
        // bankAccount.displayDetails();
        // bankAccount.withdraw(7000);
        // bankAccount.displayDetails();
        // bankAccount.transfer(1000, 45698);
        // bankAccount.displayDetails();

    }
}
