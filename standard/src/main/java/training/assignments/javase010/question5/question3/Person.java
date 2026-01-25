package training.assignments.javase010.question5.question3;

public class Person {

    public String firstName;
    public String lastName;

    Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

}
