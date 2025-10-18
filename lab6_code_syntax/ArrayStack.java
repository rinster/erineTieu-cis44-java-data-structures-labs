package lab6_code_syntax;

public class ArrayStack<T> implements Stack<T> {
    public static final int CAPACITY = 1000;
    public T[] data;
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    } // constructs with default capacity

    public ArrayStack(int capacity) {
        data = (T[]) new Object(capacity);
    }

    public int size() {
        return t + 1;
    }

    public boolean isEmpty() {
        return (t == 1);
    }

    @Override
    public void add(T element) throws IllegalStateException {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full");
        data[++t] = element;
    }

    @Override
    public T peek() {
        if (isEmpty())
            return null;
        return data[t];
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null;
        T answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

}
