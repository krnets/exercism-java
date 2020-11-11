public class CircularBuffer<T> {

    private final int capacity;
    private T[] buffer;
    private int size;
    private int front;
    private int back;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        clear();
    }

    public void clear() {
        buffer = (T[]) new Object[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    public void write(T value) throws BufferIOException {
        if (size == capacity) {
            throw new BufferIOException("Tried to write to full buffer");
        }
        addLast(value);
    }

    private void addLast(T value) {
        buffer[back % capacity] = value;
        back = incrementCircularPosition(back);
        size++;
    }

    private int incrementCircularPosition(int position) {
        return (position + 1) % capacity;
    }

    public void overwrite(T value) {
        if (size == capacity) {
            buffer[front] = value;
            front = incrementCircularPosition(front);
        } else {
            addLast(value);
        }
    }

    public T read() throws BufferIOException {
        if (size == 0) {
            throw new BufferIOException("Tried to read from empty buffer");
        }
        T value = buffer[front];
        front = incrementCircularPosition(front);
        size--;

        return value;
    }
}