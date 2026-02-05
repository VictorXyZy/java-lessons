package training.exercises.javase018;

public class Stack<T, V, W> {

    private T push;
    private V pop;
    private W peek;

    Stack(T push, V pop, W peek) {
        this.push = push;
        this.pop = pop;
        this.peek = peek;
    }

}
