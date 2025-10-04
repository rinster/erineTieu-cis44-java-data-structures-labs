package lab5_travel_itinerary_manager;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedPositionalList<T> implements Iterable<T> {

    private static class Node<T> implements Position<T> {
        private T element;
        private Node<T> prev;
        private Node<T> next;

        public Node(T e, Node<T> p, Node<T> n) {
            element = e;
            prev = p;
            next = n;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setPrev(Node<T> p) {
            prev = p;
        }

        public void setNext(Node<T> n) {
            next = n;
        }

        public void setElement(T e) {
            element = e;
        }
    }

    private Node<T> header;
    private Node<T> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<T> validate(Position<T> p) {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("Invalid position.");
        Node<T> node = (Node<T>) p;
        if (node.getNext() == null)
            throw new IllegalStateException("Position is no longer valid.");
        return node;
    }

    private Position<T> position(Node<T> node) {
        return (node == header || node == trailer) ? null : node;
    }

    public Position<T> first() {
        return position(header.getNext());
    }

    public Position<T> last() {
        return position(trailer.getPrev());
    }

    public Position<T> before(Position<T> p) {
        Node<T> node = validate(p);
        return position(node.getPrev());
    }

    public Position<T> after(Position<T> p) {
        Node<T> node = validate(p);
        return position(node.getNext());
    }

    private Position<T> addBetween(T e, Node<T> pred, Node<T> succ) {
        Node<T> newNode = new Node<>(e, pred, succ);
        pred.setNext(newNode);
        succ.setPrev(newNode);
        size++;
        return newNode;
    }

    public Position<T> addFirst(T e) {
        return addBetween(e, header, header.getNext());
    }

    public Position<T> addLast(T e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    public Position<T> addBefore(Position<T> p, T e) {
        Node<T> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    public Position<T> addAfter(Position<T> p, T e) {
        Node<T> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    public T set(Position<T> p, T e) {
        Node<T> node = validate(p);
        T old = node.getElement();
        node.setElement(e);
        return old;
    }

    public T remove(Position<T> p) {
        Node<T> node = validate(p);
        Node<T> pred = node.getPrev();
        Node<T> succ = node.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
        size--;
        T element = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return element;
    }

    private class ElementIterator implements Iterator<T> {
        private Position<T> cursor = first();

        public boolean hasNext() {
            return cursor != null;
        }

        public T next() {
            if (cursor == null)
                throw new NoSuchElementException();
            T result = cursor.getElement();
            cursor = after(cursor);
            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementIterator();
    }
}