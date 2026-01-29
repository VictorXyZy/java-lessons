package LESSON1.overloadedconstructors;

public class Main {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        // with different parameter lists
        // - Enables objects to be initialised in various ways

        User user1 = new User("IAN");
        User user2 = new User("vic", "dij@fvm.com");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

    }
}
