package lab6_code_syntax;

public interface Stack<E> {
    void push(E item);

    E pop();

    E peek();

    boolean isEmpty();
}
