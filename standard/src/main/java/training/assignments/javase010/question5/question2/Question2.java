package training.assignments.javase010.question5.question2;

public class Question2 {
    public static void main(String[] args) {

        // Why should fields be declared private in a class?

        // This is a private field cannot be changed directly hence is controlled e.g

        Person person = new Person("ian");

        // person.name = "vic";// not possible to change this name one can only change
        // it using setters
        person.setName("vic");

    }
    // Why should fields be declared private in a class?

    // This is a private field cannot be changed directly hence is conttrolled e.g

    Person person = new Person("ian");

    // person.name = "vic";

}
