package training.assignments.javase014.question3;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stock, String author, String publisher, String isbn) {
        super(productId, name, price, stock);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return price = price * 0.05;
    }

    @Override
    public String getProductType() {
        return "Books";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The author of the book is: " + author);
        System.out.println("The publisher of the book is: " + publisher);
        System.out.println("The isbn of the book is: " + isbn);
    }

}
