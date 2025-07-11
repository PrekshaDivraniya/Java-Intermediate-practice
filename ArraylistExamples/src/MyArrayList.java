import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] items;
    private int size = 0;
    private final int initial_capacity = 10;

    public MyArrayList(){
        items = new Object[initial_capacity];
    }

    public void add(T item){
        if(size == items.length){
            resize();
        }
        items[size++] = item;
    }

    public T getItem(int index){
        checkIndex(index);
        return (T) items[index];
    }

    public void removeItem(int index){
        checkIndex(index);
        T removed = (T) items[index];
        for(int i=index; i<size-1;i++){
            items[i] = items[i+1];
        }
        size++;
    }

    public int getSize(){
        return size;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bound");
        }
    }

    private void resize() {
        int newCapacity = items.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(items, 0, newArray,0,size);
        items = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<size;i++){
            sb.append(items[i]);
            if(i < size - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
