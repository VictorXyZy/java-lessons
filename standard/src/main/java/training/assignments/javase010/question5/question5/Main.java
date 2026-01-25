package training.assignments.javase010.question5.question5;

public class Main {
    public static void main(String[] args) {

        // How does encapsulation improve code maintainability?

        // It makes it easier for developer to understand
        // It contains changes to individual classes
        // It lowers the risk of bugs

        Car car = new Car("lexus", "gx550", 2025);

        // System.out.println(car.make); -> cannot access because it is private you use
        // getters and setters

        System.out.println(car.getMake());

    }
}
