package training.assignments.javase014.question4;

public class Main {
    public static void main(String[] args) {

        // Issues with the code

        // 1. There is no clsoing curly braces for the EmployeeManagement class
        // Solution = Add a closing curly brace.

        // 2. The method calculateBonus is stated to be of type void
        // Solution = Remove the void as a void type cannot return a return a value
        // state the type to be a double
        // hence it will be public double calculateBonus()

        // 3. String name in the constructor is supposed to be String employeeName
        // Solution = public EmployeeManagementFixed(String employeeName, double salary)
        // {
        // this.employeeName = employeeName;
        // this.salary = salary;
        // }

        // 4. The String employeeName is never instatiated well in the constructor as
        // there is no this
        // Solution = public EmployeeManagement(String employeeName, double salary) {
        // this.employeeName = employeeName;
        // this.salary = salary;
        // }

        // 5. The private double salary is never instatiated in the constructor
        // Solution = public EmployeeManagement(String employeeName, double salary) {
        // this.salary = salary;
        // }

        // 6. The public static String companyName has no value
        // solution = public static String companyName = "SAFARICOM";

        // 7. There is no getSalary method even though a setSalary is declared
        // Solution = public double getSalary(){
        // return salary;
        // }

        // 8. In the setSalary method the salary = salary, the assignment to variable
        // salary has no effect
        // Solution = this.salary = salary;

        // 9. The value of the field companyName and employeeName is not used
        // Solution = public void displayOutput() {
        // System.out.println("Company Name is: " + companyName);
        // System.out.println("Employee Name is: " + employeeName);
        // System.out.println("Employee Salary is: " + salary);
        // System.out.println("Bonus is: " + calculateBonus());
        // }

        // 10. The companyName field is stated as public which is a bad practise
        // Solution = private static String companyName;

        // 11. In the setSalary method a system out is used instead of an exeption
        // Solution = Use a throw InvalidEntryException method

        try {
            EmployeeManagementFixed employeeManagementFixed = new EmployeeManagementFixed("VICTOR XYZY", 10000);

            employeeManagementFixed.setSalary(-200);
            employeeManagementFixed.displayOutput();

        } catch (InvalidEntryException iee) {
            System.out.println("INVALID ENTRY");
        }

    }
}
