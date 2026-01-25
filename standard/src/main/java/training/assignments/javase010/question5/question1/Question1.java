package training.assignments.javase010.question5.question1;

public class Question1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // 1. What is the difference between method overloading and method overriding?

        System.out.println(add(2, 3));
        System.out.println(add(1, 2, 3));

        sound();
        dog.sound();

    }

    // Method overloading is whereby a methods may share the same name but have
    // different parameters e.g

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method overriding - is whereby a subclass typically in a child provides its
    // own implelentation
    // of a method typically in a child instead of inheriting the properties from
    // a parent class e.g

    static void sound() {
        System.out.println("An animal makes a sound");
    }

}
