package training.assignments.javase010.question1;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    Book(String title, String author, String isbn, double price, boolean isAvailable) {
        setTitle(title);
        setIsbn(isbn);
        setAuthor(author);
        setPrice(price);
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            System.out.println("Author cannot be null or empty.");
        }
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            System.out.println("Isbn must be 13 digits");
        }
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
        }
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Book is already available.");
        }
    }

    @Override
    public String toString() {
        return "Book [Title=" + title +
                ", Author=" + author +
                ", ISBN=" + isbn +
                ", Price=" + price +
                ", Available=" + isAvailable + "]";
    }

}
