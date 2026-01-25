package training.assignments.javase010.question2;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Their department is:" + this.department);
    }
}
