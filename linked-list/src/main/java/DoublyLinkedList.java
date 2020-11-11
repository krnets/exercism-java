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

    private Node<T> header;
    private Node<T> trailer;
    private int size;

    DoublyLinkedList() {
        header = new Node<>();
        trailer = new Node(null, header, null);
        header.previous = trailer;
        size = 0;
    }

    public void push(T value) {
        Node node = new Node(value, trailer.next, trailer);
        trailer.next.previous = node;
        trailer.next = node;
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T element = trailer.next.value;

        trailer.next = trailer.next.next;
        trailer.next.previous = trailer;
        size--;

        return element;
    }

    public T shift() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T element = header.previous.value;

        header.previous = header.previous.previous;
        header.previous.next = header;
        size--;

        return element;
    }

    public void unshift(T value) {
        Node node = new Node(value, header, header.previous);
        header.previous.next = node;
        header.previous = node;
        size++;
    }
}

