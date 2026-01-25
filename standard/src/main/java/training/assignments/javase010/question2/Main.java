package training.assignments.javase010.question2;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("VIC XYZY", 25896, 1000);
        Manager manager = new Manager("JOHN SNOW", 56598, 2000, "FINANCE");
        Developer developer = new Developer("BOB CROW", 66987, 1500, "JAVA");

        employee.displayInfo();
        System.out.println("\n");
        manager.displayInfo();
        System.out.println("\n");
        developer.displayInfo();

    }
}
