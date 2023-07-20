
public class MyArrayList {
    private Object[] data;
    private int size;
    public MyArrayList(){
        data = new Object[10];
        size = 0;
    }

    public void add(Object value){
        if ( size == data.length){
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0,newData, 0, newData.length);
            data = newData;
        }
        data[size] = value;
        size++;
    }
    public void remove ( int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++){
            data[i] = data[i + 1];

        }
        size--;
    }
    public void clear (){
        data = new Object[10];
        size = 0;
    }
    public int size(){
        return size;
    }
    public Object get (int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
}
