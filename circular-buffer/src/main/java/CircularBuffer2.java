/*
public class CircularBuffer {

    private final int capacity;
    private int[] buffer;
    private int size;
    private int front;
    private int back;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    public void write(int value) throws BufferIOException {
        if (size == capacity) {
            throw new BufferIOException("Tried to write to full buffer");
        }
        buffer[back % capacity] = value;
        back = (back + 1) % capacity;
        size++;
    }

    public int read() throws BufferIOException {
        if (size == 0) {
            throw new BufferIOException("Tried to read from empty buffer");
        }
        int value = buffer[front];
        front = (front + 1) % capacity;
        size--;

        return value;
    }

    public void clear() {
        buffer = new int[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    public void overwrite(int value) {
        if (size == capacity) {
            buffer[front] = value;
            front = (front + 1) % capacity;
        } else {
            buffer[back % capacity] = value;
            back = (back + 1) % capacity;
            size++;
        }
    }
}*/
