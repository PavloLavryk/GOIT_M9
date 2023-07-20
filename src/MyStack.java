import java.util.NoSuchElementException;

public class MyStack {

    private Object[] data;
    private int top;
    private int size;

    public MyStack() {
        data = new Object[10];
        top = -1;
        size = 0;
    }

    public void push(Object value) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        top++;
        data[top] = value;
        size++;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object value = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;

    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Object value = data[top];
        top--;
        size--;
        return value;
    }

    public Object peek() {
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