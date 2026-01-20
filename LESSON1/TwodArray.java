package LESSON1;

public class TwodArray {
    public static void main(String[] args) {
        // 2D array = an array where each element is an array
        // useful for storing a matrix of data

        // String[] fruits = { "oranges", "apples", "banana" };
        // String[] vegetables = { "potatos", "carrots", "onions" };
        // String[] meats = { "chicken", "pork", "beef", "fish" };

        // String[][] groceries = { fruits, vegetables, meats };

        // the above can also be set up as: hence eliminating the names fruits,
        // vegetables, meats

        String[][] groceries = { { "oranges", "apples", "banana" },
                { "potatos", "carrots", "onions" },
                { "chicken", "pork", "beef", "fish" } };

        // to replace or access an element you need 2 [] e.g replace oranges with
        // pineapples
        // the first [] is rows, the second is column

        groceries[2][3] = "bruh";

        for (String[] grocery : groceries) {

            for (String food : grocery) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
