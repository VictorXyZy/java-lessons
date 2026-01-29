package LESSON1.exceptionslesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exceptions = An event that interrupts the normal flow of a program
        // (Dividing by zero, file not found , mismatch input)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}., finally{}
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasnt a number");
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        } catch (Exception e) { // this is a catch all statement, its not good practice
                                // as user wont know what they did wrong
                                // ONLY USED AT END
                                // Used if all else fails and there is an exeption you dont anticipate
            System.out.println("SOMETHING WENT WRONG");

        } finally {
            // finally will always excecute whether there is an exception or not
            // used to clean up resources e.g forgetting to close the scanner
            // used when one opens a file in the try block and want to close it.

            scanner.close();
            System.out.println("hbuokoj");
        }

        // try with resources = e.g rather than declaring scanner outside try
        // block declat=re it within () e.g
        // try(Scanner scanner = new Scanner(System.in)){
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        // System.out.println(number);

        // java will automatically closes the resources like
        // the scanner classes. e.g no need for scanner.close()
        // }
    }
}
