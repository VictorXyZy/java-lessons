package training;

import java.util.Scanner;

public class AssignmentOne_VictorMungereti {
    public static void main(String[] args) {

        // validOperations();
        // gradeCalculator();
        // numberSequence();
        inputValidation();
        // patternPrinting();

    }

    static int validOperations() {
        int a = 15;
        int b = 4;
        int c = 7;
        int sum = 0;
        int product = 0;
        int result = 0;
        int remainder = 0;

        sum = a + b + c;
        product = a * b;
        result = (a + b) * c;
        remainder = a / b;

        System.out.println("\nThe sum is: " + sum);

        System.out.println("\nThe product is: " + product);

        System.out.println("\nThe result is: " + result);

        System.out.println("\nThe remainder is: " + remainder);
        return remainder;

    }

    static void gradeCalculator() {
        int score = 100;
        char grade = 0;

        if (score < 101) {
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 89) {
                grade = 'B';
            } else if (score >= 70 && score < 79) {
                grade = 'C';
            } else if (score >= 60 && score < 69) {
                grade = 'D';
            } else if (score < 60) {
                grade = 'F';
            }
            System.out.println("Your grade is: " + grade);
        }

        else {
            System.out.println("Error: Score must be between 0 and 100");

        }

    }

    static void numberSequence() {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print("EVEN - ");
            } else if (i % 5 == 0) {
                System.out.print("Multiple of 5, " + "ODD - ");
            } else {
                System.out.print("ODD - ");
            }
            System.out.println(i);

        }
    }

    static void inputValidation() {
        Scanner scanner = new Scanner(System.in);

        int input;

        System.out.print("Enter a positive integer: ");
        input = scanner.nextInt();

        while (input < 0) {
            System.out.print("Enter a positive integer: ");
            input = scanner.nextInt();
        }
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial of " + input + " is " + factorial);

        scanner.close();
    }

    static void patternPrinting() {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
