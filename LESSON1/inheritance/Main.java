package LESSON1.inheritance;

public class Main {

    public static void main(String[] args) {

        // Inheritance = one class inherits the attributes and methods from another
        // class.
        // child <- parent <- grandparent

        Dog dog = new Dog();
        Fish fish = new Fish();

        System.out.println(dog.life);
        System.out.println(fish.life);

        dog.speak();
        fish.speak();

    }

}
