package training.assignments.javase014.question3;

public class InventoryManagement extends Product {

    // more confirmation on this class especially how to handle out of stock
    // scenarios and validate product data

    public InventoryManagement(String productId, String name, double price, int stock) {
        super(productId, name, price, stock);

    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public String getProductType() {
        return " ";
    }

    public void displayInfo() {
        System.out.println("Product stock is: " + stock);
        // System.out.println(Product.reduceStock());
    }

}
