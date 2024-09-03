import java.util.Collection;

public interface MyList<T> {
    void add(T item);
    T get(int index);
    void remove(int index);
    void addAll(Collection<? extends T> collection);


}
