package training.exercises.javase011.praciceexercise2;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Alice", 101, 80000, "HR"),
                new Developer("Bob", 102, 70000, "Java"),
                new Intern("Charlie", 103, 30000, "MIT")
        };

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("--------------------");
        }
    }
}
