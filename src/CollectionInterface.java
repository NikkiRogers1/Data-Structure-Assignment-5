public interface CollectionInterface<T> {
    void add(T item);
    T get(T item);
    boolean contains(T item);
    void remove(T item);
    boolean isFull();
    boolean isEmpty();
    int size();

}
