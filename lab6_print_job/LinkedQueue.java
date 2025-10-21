package lab6_print_job;

class LinkedQueue<E> implements Queue<E> {
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> front;
    private Node<E> rear;

    @Override
    public void enqueue(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        E item = front.data;
        front = front.next;
        if (front == null)
            rear = null; // reset if queue becomes empty
        return item;
    }

    @Override
    public E peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return front.data;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }
}
