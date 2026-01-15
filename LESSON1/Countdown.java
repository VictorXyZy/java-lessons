package LESSON1;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds of countdown? ");
        int start = scanner.nextInt();

        // ignore the thread method it is advanced java

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("Happy");

        scanner.close();
    }
}
