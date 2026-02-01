package training.assignments.javase014.question1;

public class DVD extends LibraryItem {

    public String duration;
    public String rating;

    DVD(String itemId, String title, String author, boolean isAvaliable, String duration, String rating) {
        super(itemId, title, author, isAvaliable);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("DVD duration is: " + duration);
        System.out.println("DVD rating is: " + rating);
    }

}
