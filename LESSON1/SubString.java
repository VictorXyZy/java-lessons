package LESSON1;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        // .sunstring(start, end)
        // Program is not flexible
        // to make more flexible use indexOf

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(domain);
            System.out.println(username);
            scanner.close();
        } else {
            System.out.println("Emails must contain @");
        }

    }

}
