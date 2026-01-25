package training.exercises.javase008;

public class Book {

    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private int dueDays;

    public Book(String isbn, String title, String author) {

        if (isValidIsbn(isbn)) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN. Must be 13 digits.");
            this.isbn = "0000000000000";
        }

        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty.");
            this.title = "Unknown Title";
        }
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be empty.");
            this.author = "Unknown Author";
        }

        isAvailable = true;
        dueDays = 0;
    }

    private boolean isValidIsbn(String isbn) {
        if (isbn == null || isbn.length() != 13) {
            return false;
        }

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getDueDays() {
        return dueDays;
    }

    public void borrowBook() {
        if (!isAvailable) {
            System.out.println("Book is already borrowed.");
            return;
        }

        isAvailable = false;
        dueDays = 14;
        System.out.println("Book borrowed. Due in 14 days.");
    }

    public void returnBook() {
        isAvailable = true;
        dueDays = 0;
        System.out.println("Book returned.");
    }

    public void passOneDay() {
        if (!isAvailable) {
            dueDays--;
        }
    }

    public boolean isOverdue() {
        return !isAvailable && dueDays < 0;
    }

}
