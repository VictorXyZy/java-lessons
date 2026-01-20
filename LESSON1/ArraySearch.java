package LESSON1;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // for int you use == to find equal to
        // for String you use .equal to find equal to

        // int[] numbers = { 1, 5, 7, 3, 8, 6 };
        // int target = 8;
        boolean isFound = false;
        String[] fruits = { "apple", "orange", "banana" };
        String target;

        System.out.print("Enter the fruit you are searching for: ");
        target = scanner.nextLine();
        /*
         * for (int i = 0; i < numbers.length; i++) {
         * 
         * if (target == numbers[i])
         * {
         * System.out.println("Element found at target: " + i);
         * isFound = true;
         * break;
         * 
         * }
         * }
         */

        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i].endsWith(target)) {
                System.out.println("Element found at target: " + i);
                isFound = true;
                break;

            }
        }

        if (!isFound) {
            System.out.println("Element not found in array");

        }
        scanner.close();
    }
}
