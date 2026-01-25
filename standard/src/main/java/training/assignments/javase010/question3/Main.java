package training.assignments.javase010.question3;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        System.out.println(calculator.add(5, 6));
        System.out.println(scientificCalculator.add(7, 7));
        System.out.println(scientificCalculator.power(2, 3));
        System.out.println(scientificCalculator.squareRoot(5));
    }
}
