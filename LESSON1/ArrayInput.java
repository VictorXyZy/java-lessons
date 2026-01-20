package LESSON1;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // the compiler needs to first know the size of the array
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {

            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();

        }
        for (String food : foods) {
            System.out.println(food);

        }

        scanner.close();

    }
}
