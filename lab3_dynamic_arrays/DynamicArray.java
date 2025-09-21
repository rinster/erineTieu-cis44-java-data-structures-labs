package lab3_dynamic_arrays;

public class DynamicArray<T> {
    private T[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        this.data = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    public T remove(int index) {
        checkIndex(index);
        T removedElem = data[index];

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        return removedElem;
    }

    public int size() {
        return size;
    }

    public int arrLen() { // check if arr doubled
        return data.length;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newData = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + arrLen());
        }
    }

    public void printDynamicArr() {
        System.out.println("--------- Printing Array ---------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
