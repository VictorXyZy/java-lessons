package LESSON1;

public class Methods {

    public static void main(String[] args) {

        // a block of reusable code that is executed when called

        int age = 15;

        if (ageCheck(age)) {
            System.out.println("dkjfng");

        } else {
            System.out.println("You musdshdbsh");
        }

    }

    static void happyBirthday(String name, int age) {

        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", age);
    }

    static double cube(double number) {
        return number * number * number;

    }

    static double square(double number) {
        return number * number;
    }

    static String getFullName(String first, String last) {

        return first + " " + last;
    }

    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
