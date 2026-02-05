package training.exercises.javase012;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "Alice", 10000);
        BankAccount account2 = new BankAccount(102, "Bob", 5000);

        account1.deposit(20000);
        account2.withdraw(1000);
        System.out.println();

        account1.applyInterest();
        account2.applyInterest();
        System.out.println();

        account1.display();
        account2.display();
        System.out.println();

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        System.out.println();
    }
}
