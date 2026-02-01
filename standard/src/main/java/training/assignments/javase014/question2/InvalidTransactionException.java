package training.assignments.javase014.question2;

public class InvalidTransactionException extends RuntimeException {

    InvalidTransactionException(String message) {
        super(message);
    }
}
