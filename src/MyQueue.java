import java.util.NoSuchElementException;

public class MyQueue {

    private Object[] data;
    private int head;
    private int tail;
    private int size;

    public MyQueue() {
        data = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(Object value) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return data[head];
    }

    public Object poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Object value = data[head];
        head = (head + 1) % data.length;
        size--;
        return value;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

    public int size() {
        return size;
    }
}