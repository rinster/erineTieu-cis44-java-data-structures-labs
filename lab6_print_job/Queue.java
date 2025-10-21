package lab6_print_job;

interface Queue<E> {
    void enqueue(E item);

    E dequeue();

    E peek();

    boolean isEmpty();
}
