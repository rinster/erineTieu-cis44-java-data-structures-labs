package lab6_code_syntax;

class ArrayStack<E> implements Stack<E> {
    private E[] data;
    private int top = -1;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public void push(E item) {
        if (top == data.length - 1)
            throw new RuntimeException("Stack overflow");
        data[++top] = item;
    }

    public E pop() {
        if (isEmpty())
            throw new RuntimeException("Stack underflow");
        return data[top--];
    }

    public E peek() {
        if (isEmpty())
            throw new RuntimeException("Stack underflow");
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
