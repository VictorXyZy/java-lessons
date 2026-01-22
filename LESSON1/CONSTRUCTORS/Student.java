package LESSON1.CONSTRUCTORS;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // to give each object a unique name, age... you use a constructor
    
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    
    // FOR BOOLEAN YOU DONT NEED TO ASSIGN OBJECT LIKE (boolean isEnrolled)

        this.isEnrolled = true;

    }

}
