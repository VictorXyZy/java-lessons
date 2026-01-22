package LESSON1.CONSTRUCTORS;

public class Main {
    public static void main(String[] args) {

        // construtor = A special method to initialize objects
        // You can pass arguments to a constructor
        // and set up initial values, can create objects with unique values

        // and example is: in the previous session of car you could only make various
        // amounts of the lexus
        // You could not change the color of model all of them would be lexus gx 550
        // With a constructor you can change that

        Student student1 = new Student("XYZY", 27, 3.6);
        Student student2 = new Student("dog", 65, 2.9);

        System.out.println(student1.gpa);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

    }

}
