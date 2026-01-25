package training.assignments.javase010.question5.question3;

public class Main {
    public static void main(String[] args) {
        // When should you use the super keyword?
        // you use super keyword from parent class to call parent constructor e.g

        Person person = new Person("victor", "diesel");
        Student student = new Student("ann", "john", 'A');

        person.showName();
        student.showName();

        // Hence student class can use the showName method from its parent Person using
        // the super method on the constructor
        System.out.println(student.score);
    }
}
