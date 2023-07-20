import java.util.NoSuchElementException;

public class MyQueue<T> {

    private T[] data;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public MyQueue() {
        data = (T[]) new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            @SuppressWarnings("unchecked")
            T[] newData = (T[]) new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[(head + i) % data.length];
            }
            data = newData;
            head = 0;
            tail = size;
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return data[head];
    }

    public T poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T value = data[head];
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
