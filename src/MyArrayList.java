
import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(Collection<? extends T> collection) {
        elements = new Object[collection.size()];
        for (T element : collection) {
            this.add(element);
        }
    }

    public void add(T item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = item;
    }

    public T get(int index) {
        if (checkIndex(index)) {
            return null;
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (checkIndex(index)) {
            return;
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    private boolean checkIndex(int index) {
        boolean check = index < 0 || index >= size;
        if (check) System.out.println("Индекс некорректно задан");
        return check;
    }

    public void addAll(Collection<? extends T> collection) {
        if (!collection.isEmpty()) {
            for (T element : collection) {
                this.add(element);
            }
        }
    }

    public static <E extends Comparable<E>> Object[] bubbleSort(Collection<E> collection) {
        Object[] array = collection.toArray();
        boolean sortCompleted;
        do {
            sortCompleted = true;
            for (int i = 1; i < array.length; i++) {
                if (((E) array[i - 1]).compareTo((E) array[i]) > 0) {
                    Object temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    sortCompleted = false;
                }
            }
        } while (!sortCompleted);
        return array;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}