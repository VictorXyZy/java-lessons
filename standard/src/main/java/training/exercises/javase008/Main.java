package training.exercises.javase008;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("7894561239632", "Shadow slave ", "Guilty Three");

        System.out.println("Available: " + book.isAvailable());

        book.borrowBook();
        for (int i = 0; i < 15; i++) {
            book.passOneDay();
        }

        System.out.println("Days left: " + book.getDueDays());
        System.out.println("Is overdue? " + book.isOverdue());

        book.returnBook();
        System.out.println("Available after return: " + book.isAvailable());

    }
}
