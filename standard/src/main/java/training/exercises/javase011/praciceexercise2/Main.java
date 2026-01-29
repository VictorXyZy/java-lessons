package training.exercises.javase011.praciceexercise2;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("BEN", 2589, 100000, "IT");
        Developer developer = new Developer("ian", 5689, 50000, "JAVA");
        Intern intern = new Intern("vic", 69845, 5000, "DEkut");

        manager.displayInfo();
        System.out.println();
        developer.displayInfo();
        System.out.println();
        intern.displayInfo();
    }
}
