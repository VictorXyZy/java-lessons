package LESSON1;

public class BreakContinue {
    public static void main(String[] args) {

        // break = break out of a loop (STOP )
        // continue = skip Current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                // break;
                continue;

            }
            System.out.print(i + " ");
        }
    }
}
