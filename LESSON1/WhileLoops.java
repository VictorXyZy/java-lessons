package LESSON1;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // while loops = will repeat some code forever while some condition remains
        // true.

        Scanner scanner = new Scanner(System.in);
        /*
         * String name = "";
         * if (name.isEmpty()) {
         * System.out.print("Enter your name: ");
         * name = scanner.nextLine();
         * 
         * }
         * 
         * System.out.println("Hello " + name);
         * /* /*
         */
        // if you do not enter a name the program will still continue hence the need for
        // a while loop
        // it is used if a user needs to enter an input to continue like entering a
        // username or password.
        // be cautious of an infinite loop.

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

        }

        System.out.println("Hello " + name);

        scanner.close();
    }
}
