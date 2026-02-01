package training.assignments.javase014.question1;

public class Main {
    public static void main(String[] args) {
        // LIBRARY MANAGEMENT SYSTEM

        LibraryItem libraryItem = new LibraryItem("SB0125", "ANGELS & DEMONS", "DAN BROWN", true);
        Book book = new Book("SB6987", "SHADOW SLAVE", "GUILTY THREE", true, 12345678, "ACTION");
        DVD dvd = new DVD("SB78945", "JUMPER", "ROCK", true, "130 MINUTES", "3.6");
        Magazine magazine = new Magazine("sb45698", "PULSE", "NTV", true, 1478, "123645");

        libraryItem.displayDetails();
        System.out.println();
        book.displayDetails();
        System.out.println();
        dvd.displayDetails();
        System.out.println();
        magazine.displayDetails();

    }
}
