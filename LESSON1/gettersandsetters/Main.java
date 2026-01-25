package LESSON1.gettersandsetters;

public class Main {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modyfing them
        // GETTERS = Methods that make a field READABLE
        // You can add additional logic with getters
        // SETTERS = Methods that make a field WRITABLE

        Car car = new Car("lexus", "red", 10000);

        car.setColor("Blue");
        car.setPrice(-10);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
