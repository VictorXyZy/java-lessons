package LESSON1;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        // nested loop = A loop inside another loop
        // Often used with matrices or data structures and algorithms
        // can be a for or while loop

        // if we have a loop inside another we cant use the same index e.g cannot use i
        // in main n nested loop
        // as such we use j instead og i

        /*
         * for (int i = 1; i <= 3; i++) {
         * for (int j = 1; j <= 9; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the character: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);

            }
            System.out.println();

        }

        scanner.close();

    }
}
