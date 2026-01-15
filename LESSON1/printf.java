package LESSON1;

public class printf {
    public static void main(String[] args) {

        // printf() = is a methos used to formart output

        // %[flags][width][.precision][specific character]

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 26;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with an %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

    }
}
