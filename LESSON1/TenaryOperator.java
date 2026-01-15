package LESSON1;

public class TenaryOperator {
    public static void main(String[] args) {

        // tenary operator ? = Return 1 of two values if a condition is true
        // is used as an alternative to an if else statement
        // variable = (condition) ? ifTrue : ifFalse

        int score = 40;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

    }
}
