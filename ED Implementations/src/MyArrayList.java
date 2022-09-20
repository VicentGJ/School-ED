public class MyArrayList<E> {
    private Object[] array;
    private int length;
    private int maxLength;

    public MyArrayList() {
        array = new Object[10];
        maxLength = 10;
    }

    public int size() {
        return length;
    }
    private void copyAll(Object[] newArray, Object[] oldArray){
        if (this.maxLength >= 0) System.arraycopy(oldArray, 0, newArray, 0, this.maxLength);
    }
    @SuppressWarnings("unchecked")
    public E get(int pos) {
        return (E) this.array[pos];
    }

    public void add(E data) {
        length++;
        if (length > maxLength) {
            Object[] newArray = new Object[length];
            this.copyAll(newArray, this.array);
            this.array = newArray;
            maxLength = length;
        }
        this.array[length-1] = data;
    }

    public void insert(E data, int pos) {
        E floating;
        length++;
        floating = data;
        if (length > maxLength) {
            Object[] newArray = new Object[maxLength + 10];
            this.copyAll(newArray, this.array);
            this.array = newArray;
            maxLength += 10;
        }
        for (int i = pos; i < this.size(); i++) {
            data = floating;
            floating = this.get(i);
            this.array[i] = data;
        }
    }

    public boolean remove(E data) {
        int pos = -1;
        for (int i = 0; i < length; i++) {
            if (this.get(i) == data) pos = i;
        }
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < length; i++) {
            if (i == length-1) {
                this.array[i] = null;
            } else this.array[i] = this.get(i+1);
        }
        length--;
        return true;
    }
}
