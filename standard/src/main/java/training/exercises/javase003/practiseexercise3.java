package training.exercises.javase003;

import java.util.Scanner;

public class practiseexercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic light color ( red, yellow, green, blinking red, blinking yellow): ");
        String light = scanner.nextLine().toLowerCase();
        String action = switch (light) {
            case "red" -> "Stop";
            case "yellow" -> "Prepare to stop";
            case "green" -> "Go";
            case "blinking red" -> "Treat as stop sign";
            case "blinking yellow" -> "Proceed with caution";
            default -> "Invalid light color";
        };
        System.out.println("Action: " + action);
        scanner.close();
    }
}
