package training.assignments.javase010.question2;

public class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {

        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter a name");
        } else {
            this.name = name;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Please enter an ID");
        } else {
            this.id = id;
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateBonus() {
        return getSalary() * 0.05;

    }

    public void displayInfo() {
        System.out.println(this.name + "'s " + "Id is: " + this.id + " and salary is: " + this.getSalary());
        System.out.println("His bonus is: " + calculateBonus());
    }
}
