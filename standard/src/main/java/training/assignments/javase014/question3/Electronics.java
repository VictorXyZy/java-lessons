package training.assignments.javase014.question3;

public class Electronics extends Product {

    protected int warrantyPeriod;
    protected double powerConsumption;

    public Electronics(String productId, String name, double price, int stock, int warrantyPeriod,
            double powerConsumption) {
        super(productId, name, price, stock);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {
        return price = price * 0.15;
    }

    @Override
    public String getProductType() {
        return "Electronics";

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Electronic warranty period is: " + warrantyPeriod);
        System.out.println("Electronic power consumption is: " + powerConsumption);

    }

}
