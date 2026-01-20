package LESSON1;

public class Varargs {
    public static void main(String[] args) {

        // varargs or variable arguments = allow a method to accepts a varying number of
        // arguments
        // make methods more flexible hence no need to overloaded methods

        // overloaded methods = share same name but different parameters

        // java will pack the arguments into arrays
        // ellipses (...)

        // System.out.println(add(1, 2, 6, 7));
        System.out.println(average(3.5, 6.7, 9.2));

    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {

        double sum = 0;
        // this is if the array is empty e.g average();
        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {

            sum += number;

        }
        return sum / numbers.length;

    }
}
