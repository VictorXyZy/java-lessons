package training.assignments.javase014.question1;

public class Book extends LibraryItem {

    protected int isbn;
    public String genre;

    Book(String itemId, String title, String author, boolean isAvaliable, int isbn, String genre) {
        super(itemId, title, author, isAvaliable);
        setIsbn(isbn);
        setGenre(genre);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        if (isbn < 13) {
            System.out.println("Please enter 13 characters ");
        } else {
            this.isbn = isbn;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre.isEmpty() || genre.isBlank()) {
            System.out.println("Please enter the books' genre ");
        } else {
            this.genre = genre;
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Book ISBN is: " + isbn);
        System.out.println("Book Genre is: " + genre);
    }
}
