package training.exercises.javase007;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("SE001", "XYZY ITZY", 10000);

        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();

    }
}
