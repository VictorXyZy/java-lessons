package LESSON1.gettersandsetters;

public class Car {

    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {

        // You can add additional logic with getters like adding the $
        return "$" + this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be zero");
        } else {
            this.price = price;
        }
    }
}
