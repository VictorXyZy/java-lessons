package LESSON1;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // pretend to play a game for a user to quit must press Q key
        /*
         * 
         * String response = "";
         * 
         * while (!response.equals("Q")) {
         * System.out.println("You are playing a game");
         * System.out.print("Press Q to quit: ");
         * response = scanner.next().toUpperCase();
         * }
         * System.out.println("You have won");
         * 
         * 
         */
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age cannot be negative: ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your age is " + age + " years old");

        scanner.close();
    }
}
