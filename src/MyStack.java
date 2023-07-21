import java.util.NoSuchElementException;

public class MyStack<T> {

    private T[] data;
    private int top;
    private int size;

    @SuppressWarnings("unchecked")
    public MyStack() {
        data = (T[]) new Object[10];
        top = -1;
        size = 0;
    }
    public void checkIndexValidity(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void push(T value) {
        if (size == data.length) {
            @SuppressWarnings("unchecked")
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        top++;
        data[top] = value;
        size++;
    }

    public void remove(int index) {
        checkIndexValidity(index, size);

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        top--;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T value = data[top];
        top--;
        size--;
        return value;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return data[top];
    }

    public void clear() {
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }
}
