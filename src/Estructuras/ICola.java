package Estructuras;

public interface ICola<T> {
    public boolean empty();

    public T poll();

    public void add(T t);

    public T peek();
}