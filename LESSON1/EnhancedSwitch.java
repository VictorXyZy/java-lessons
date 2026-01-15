package LESSON1;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many if else statement (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("it is a weekday");
            case "Saturday", "Sunday" ->
                System.out.println("it is a weekend");

            default -> System.out.println(day + " is not a day ");

        }

        scanner.close();

    }
}
