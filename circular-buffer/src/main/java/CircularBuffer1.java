/*
import java.util.Deque;
import java.util.LinkedList;

public class CircularBuffer<Integer> {

    Deque<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void write(Integer value) throws BufferIOException {
        if (buffer.size() == capacity) {
            throw new BufferIOException("Tried to write to full buffer");
        }
        buffer.addLast(value);
    }

    public Integer read() throws BufferIOException {
        if (buffer.size() == 0) {
            throw new BufferIOException("Tried to read from empty buffer");
        }
        return buffer.removeFirst();
    }

    public void clear() {
        buffer.clear();
    }

    public void overwrite(Integer value) {
        if (buffer.size() == capacity) {
            buffer.removeFirst();
        }
        buffer.addLast(value);
    }
}*/
