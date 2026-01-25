package training.assignments.javase010.question2;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("They code using: " + this.programmingLanguage + " programming language");
    }

}
