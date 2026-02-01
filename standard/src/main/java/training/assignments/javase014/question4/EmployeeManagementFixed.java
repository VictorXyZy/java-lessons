package training.assignments.javase014.question4;

public class EmployeeManagementFixed {
    private static String companyName = "SYSTECH LIMITED";
    private String employeeName;
    private double salary;

    public EmployeeManagementFixed(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidEntryException {
        if (salary < 0) {
            throw new InvalidEntryException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void displayOutput() {
        System.out.println("Company Name is: " + companyName);
        System.out.println("Employee Name is: " + employeeName);
        System.out.println("Employee Salary is: " + salary);
        System.out.println("Bonus is: " + calculateBonus());
    }

}
