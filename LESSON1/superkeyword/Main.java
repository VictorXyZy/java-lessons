package LESSON1.superkeyword;

public class Main {
    public static void main(String[] args) {
        // super = refers to the parent class or subclass
        // used in constructors and method overriding
        // call the parent constructor to initialize attributes

        Person person = new Person("VIC", "NUN");
        Student student = new Student("nin", "vic", 3.65);

        System.out.println(student.gpa);
        person.showName();

    }
}
