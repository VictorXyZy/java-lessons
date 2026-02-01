package training.assignments.javase014.question3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String productId, String name, double price, int stock) {
        if (productId == null || productId.isEmpty())
            throw new InvalidProductException("Enter a valid product ID");
        if (price <= 0)
            throw new InvalidProductException("Price cannot be negative");
        if (stock < 0)
            throw new InvalidProductException("Stock cannot be negative");

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract double calculateDiscount();

    public abstract String getProductType();

    public double applyTax(double tax) {
        tax = 0.16;
        price = tax * price;
        return price + tax;
    }

    public void displayInfo() {
        System.out.println("Product ID is: " + productId);
        System.out.println("Product Name is: " + name);
        System.out.println("Product price is: " + price);
        System.out.println("Product stock is: " + stock);
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException("Product out of stock");
        }
        stock -= quantity;
    }
}
