package LESSON1.OOP;

public class Main {

    public static void main(String[] args) {
        // Object = An entitiy that holds data(attributes)
        // and can perform actions(methods)
        // It is a reference data type

        // you can also modify and change the attributes e.g the make from lexus to audi
        // example below

        Car car = new Car();

        // car.make = "audi";

        // to access attributes like the make, model you need to use a dot e.g car.price

        // System.out.println(car.make);

        // car.start();

        car.drive();
    }

}
