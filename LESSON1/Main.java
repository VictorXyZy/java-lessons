package LESSON1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a student? True/False  ");
        Boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your grade is " + grade);
        System.out.println("Student " + isStudent);

        scanner.close();

    }
}
