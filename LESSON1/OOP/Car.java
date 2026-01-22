package LESSON1.OOP;

public class Car {

    String make = "Lexus";
    String model = "GX550";
    int year = 2025;
    double price = 120000.59;
    boolean isRunninng = false;

    // and can perform actions(methods) example below

    void start() {
        System.out.println("You start the engine");
    }

    void stop() {
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }

}
