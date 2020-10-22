import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {

    private static class Node<E> {

        private final E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    private Node<T> head;
    private int listSize = 0;

    public SimpleLinkedList() {
    }

    public SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    public int size() {
        return listSize;
    }

    public T pop() {
        if (listSize == 0) {
            throw new NoSuchElementException();
        }
        T element = head.getElement();
        head = head.next;
        listSize -= 1;

        return element;
    }

    public void push(T element) {
        head = new Node<>(element, head);
        listSize += 1;
    }

    public void reverse() {
        Node<T> currNode = head;
        Node<T> nextNode;
        Node<T> prevNode = null;

//           head
//            a -> b -> c -> null
//    prev   curr
//
//``````````````````````````````````````
//                     prev  curr
//    null <- a <- b <- c
//                     head
//
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public Object[] asArray() {
        var result = new Object[listSize];
        var currNode = head;

        for (int i = 0; i < listSize; i++) {
            result[i] = currNode.getElement();
            currNode = currNode.getNext();
        }
        return result;
    }
}
