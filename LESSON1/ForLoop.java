package LESSON1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // for loop = is like a while loop but it executes some code a
        // certain amount of times not infinite times like a while loop

        // within the condition() of a for loop there are 3 statements separated by a
        // semi colon
        // ( 1; 2; 3) 1st statement = used for initialization = common practice is to
        // create a counter i or loop control variable
        // 2nd statement = is a condition
        // 3rd statement = is the step, like increase or decrease + -

        Scanner scanner = new Scanner(System.in);

        /*
         * for (int i = 0; i < 10; i++) {
         * System.out.println(i);
         * 
         * }
         */

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println(i);

        }

        scanner.close();

    }
}
