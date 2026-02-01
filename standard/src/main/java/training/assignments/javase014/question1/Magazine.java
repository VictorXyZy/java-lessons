package training.assignments.javase014.question1;

public class Magazine extends LibraryItem {

    protected int issueNumber;
    protected String publicationDate;

    Magazine(String itemId, String title, String author, boolean isAvaliable, int issueNumber, String publicationDate) {
        super(itemId, title, author, isAvaliable);
        setIssueNumber(issueNumber);
        setPublicationDate(publicationDate);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber == 0 || issueNumber < 7) {
            System.out.println("Please enter the items issue Number ");
        } else {
            this.issueNumber = issueNumber;
        }
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        if (publicationDate.isEmpty() || publicationDate.isBlank()) {
            System.out.println("Please enter the magazines publication date ");
        } else {
            this.publicationDate = publicationDate;
        }

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Magazine issue Number is: " + issueNumber);
        System.out.println("Magazine publication Date is: " + publicationDate);
    }
}
