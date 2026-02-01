package training.assignments.javase014.question3;

public class Clothing extends Product {

    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stock, String size, String material,
            String color) {
        super(productId, name, price, stock);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        return price = price * 0.10;
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Clothing size is: " + size);
        System.out.println("Clothing material is: " + material);
        System.out.println("Clothing color is: " + color);

    }

}
