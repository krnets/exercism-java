import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    void insert(T value) {
        root = put(root, value);
    }

    private Node<T> put(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value);
        }
        if (value.compareTo(node.getData()) > 0) {
            node.right = put(node.right, value);
        } else {
            node.left = put(node.left, value);
        }
        return node;
    }

    List<T> getAsSortedList() {
        return get(root);
    }

    List<T> get(Node<T> pos) {
        if (pos == null) {
            return new ArrayList<>();
        }
        var result = get(pos.getLeft());
        result.add(pos.getData());
        result.addAll(get(pos.getRight()));

        return result;
    }

    List<T> getAsLevelOrderList() {
        var queue = new ArrayDeque<Node<T>>();
        queue.offer(root);

        var result = new ArrayList<T>();

        while (!queue.isEmpty()) {
            var pos = queue.pollFirst();
            result.add(pos.getData());

            if (pos.getLeft()  != null) queue.offer(pos.getLeft());
            if (pos.getRight() != null) queue.offer(pos.getRight());
        }
        return result;
    }

    Node<T> getRoot() {
        return root;
    }

    static class Node<T> {
        T value;
        Node<T> left, right;

        public Node(T value) {
            this.value = value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public Node<T> getRight() {
            return right;
        }

        public T getData() {
            return value;
        }
    }
}
