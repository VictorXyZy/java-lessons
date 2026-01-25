package training.assignments.javase010.question3;

public class ScientificCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Using a scientific calculator");
        return a + b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

}
