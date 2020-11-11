/*
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

    private class Node<E> {

        private final E value;
        private Node<E> next;
        private Node<E> previous;

        Node() {
            value = null;
        }

        Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    private Node<T> front;
    private Node<T> back;
    private int size;

    DoublyLinkedList() {
        front = new Node<>();
        back = new Node(null, front, null);
        front.previous = back;
        size = 0;
    }

    public void push(T value) {
        Node node = new Node(value, back.next, back);
        back.next.previous = node;
        back.next = node;
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T element = back.next.value;

        back.next = back.next.next;
        back.next.previous = back;
        size--;

        return element;
    }

    public T shift() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T element = front.previous.value;

        front.previous = front.previous.previous;
        front.previous.next = front;
        size--;

        return element;
    }

    public void unshift(T value) {
        Node node = new Node(value, front, front.previous);
        front.previous.next = node;
        front.previous = node;
        size++;
    }
}

*/
