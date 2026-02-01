package training.assignments.javase014.question1;

public class LibraryItem {

    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isAvaliable;

    LibraryItem(String itemId, String title, String author, boolean isAvaliable) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
        setIsAvailable(isAvaliable);
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        if (itemId.isEmpty()) {
            System.out.println("Please enter the item's ID ");
        } else {
            this.itemId = itemId;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            System.out.println("Please enter the item's title ");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.isEmpty()) {
            System.out.println("Please enter the author's name ");
        } else {
            this.author = author;
        }
    }

    public boolean getisAvailable() {
        return isAvaliable;
    }

    public void setIsAvailable(boolean isAvaliable) {
        if (isAvaliable == false) {
            System.out.println("The item requested is not available ");
        } else {
            this.isAvaliable = isAvaliable;
        }
    }

    public void checkout() {
        if (isAvaliable == true) {
            System.out.println("The requested item is available");
        }
    }

    public void returnItem(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Please enter the items name");
        }
        if (name == getTitle() || isAvaliable == false) {
            System.out.println("The book can be returned");
        }
    }

    public void displayDetails() {
        System.out.println("Item ID is: " + itemId);
        System.out.println("Item Title is: " + title);
        System.out.println("Item author is: " + author);
    }

}
