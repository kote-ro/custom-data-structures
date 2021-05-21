package main.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> extends ArrayList<T> {

    private Object[] arrayOfObjects;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        arrayOfObjects = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public boolean add(T elem) {
        add(size, elem);
        return true;
    }

    public void add(int index, T elem) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if(size > arrayOfObjects.length - 1) {
            increaseSize();
        }

        if(index < size) {
            for(int temp = size +1; temp > index; temp--) {
                arrayOfObjects[temp] = arrayOfObjects[temp-1];
            }

            arrayOfObjects[index] = elem;
            size++;
        } else {
            arrayOfObjects[size++] = elem;
        }
    }

    public boolean remove(Object elem) {
        for(int i = 0; i < size; i++) {
            if(arrayOfObjects[i].equals(elem)) {
                remove(i);
                break;
            }
        }

        return true;
    }

    public T remove(int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T oldValue = null;

        for(int i = index; i < size - 1; i++) {
            arrayOfObjects[i] = arrayOfObjects[i+1];
            oldValue = (T) arrayOfObjects[i];
        }


        arrayOfObjects[size-1] = null;
        size--;

        return oldValue;
    }

    private void increaseSize() {
        int newCapacity = (arrayOfObjects.length * 3/2) + 1;
        arrayOfObjects = Arrays.copyOf(arrayOfObjects, newCapacity);
    }

    public boolean contains(Object elem) {
        return indexOf(elem) >= 0;
    }

    public int indexOf(Object elem) {
        return indexOfRange(elem, 0, size);
    }

    private int indexOfRange(Object elem, int start, int end) {
        Object[] es = arrayOfObjects;
        if (elem == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (elem.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}

